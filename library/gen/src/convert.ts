import { autoMirroredIcons } from './mirror';
import { convertPathDataToCompose, parseSvgNumberList } from './path';
import { parseXml, type XmlElement } from './xml';

interface SvgStyle {
    fill: string;
    fillAlpha: number;
    fillRule: 'EvenOdd' | 'NonZero';
    hidden: boolean;
    stroke: string;
    strokeAlpha: number;
    strokeLineCap: 'Butt' | 'Round' | 'Square';
    strokeLineJoin: 'Bevel' | 'Miter' | 'Round';
    strokeLineWidth: number;
}

interface RenderContext {
    usesGroup: boolean;
}

const defaultStyle: SvgStyle = {
    fill: 'black',
    fillAlpha: 1,
    fillRule: 'NonZero',
    hidden: false,
    stroke: 'none',
    strokeAlpha: 1,
    strokeLineCap: 'Butt',
    strokeLineJoin: 'Miter',
    strokeLineWidth: 1,
};

const presentationAttributes = new Set([
    'display',
    'fill',
    'fill-opacity',
    'fill-rule',
    'stroke',
    'stroke-linecap',
    'stroke-linejoin',
    'stroke-opacity',
    'stroke-width',
    'visibility',
]);

export function toValidKotlinName(iconName: string): string {
    const normalized = iconName
        .replace(/[^a-zA-Z0-9-]/g, '-')
        .replace(/-+/g, '-')
        .replace(/^-+|-+$/g, '');
    const pascalCase = normalized
        .split('-')
        .filter(part => part.length > 0)
        .map(part => part.charAt(0).toUpperCase() + part.slice(1))
        .join('');
    return !pascalCase || /^\d/.test(pascalCase) ? `Icon${pascalCase}` : pascalCase;
}

function parseStyleAttribute(value: string | undefined): Record<string, string> {
    if (!value) return {};
    const declarations: Record<string, string> = {};
    for (const declaration of value.split(';')) {
        const separator = declaration.indexOf(':');
        if (separator < 0) continue;
        const name = declaration.slice(0, separator).trim().toLowerCase();
        const propertyValue = declaration.slice(separator + 1).trim();
        if (name) declarations[name] = propertyValue;
    }
    return declarations;
}

function parseNumber(value: string | undefined, fallback: number, property: string): number {
    if (value === undefined) return fallback;
    const parsed = Number(value.trim().replace(/px$/i, ''));
    if (!Number.isFinite(parsed)) throw new Error(`Invalid ${property}: ${value}`);
    return parsed;
}

function parseOpacity(value: string | undefined, fallback: number, property: string): number {
    const opacity = parseNumber(value, fallback, property);
    if (opacity < 0 || opacity > 1) {
        throw new Error(`${property} must be between 0 and 1, received ${opacity}`);
    }
    return opacity;
}

function unsupported<T>(property: string, value: string): T {
    throw new Error(`Unsupported ${property}: ${value}`);
}

function resolveStyle(element: XmlElement, inherited: SvgStyle): SvgStyle {
    const properties: Record<string, string> = {};
    for (const [name, value] of Object.entries(element.attributes)) {
        if (presentationAttributes.has(name)) properties[name] = value;
    }
    Object.assign(properties, parseStyleAttribute(element.attributes.style));

    const lineCap = properties['stroke-linecap']?.toLowerCase();
    const lineJoin = properties['stroke-linejoin']?.toLowerCase();
    const fillRule = properties['fill-rule']?.toLowerCase();
    const display = properties.display?.toLowerCase();
    const visibility = properties.visibility?.toLowerCase();
    return {
        fill: properties.fill ?? inherited.fill,
        fillAlpha: parseOpacity(properties['fill-opacity'], inherited.fillAlpha, 'fill-opacity'),
        fillRule: fillRule === 'evenodd' ? 'EvenOdd' : fillRule === 'nonzero' ? 'NonZero' : !fillRule
            ? inherited.fillRule
            : unsupported('fill-rule', fillRule),
        hidden: inherited.hidden || display === 'none' || visibility === 'hidden' || visibility === 'collapse',
        stroke: properties.stroke ?? inherited.stroke,
        strokeAlpha: parseOpacity(properties['stroke-opacity'], inherited.strokeAlpha, 'stroke-opacity'),
        strokeLineCap: lineCap === 'round' ? 'Round' : lineCap === 'square' ? 'Square' : lineCap === 'butt' ? 'Butt' : !lineCap
            ? inherited.strokeLineCap
            : unsupported('stroke-linecap', lineCap),
        strokeLineJoin: lineJoin === 'round' ? 'Round' : lineJoin === 'bevel' ? 'Bevel' : lineJoin === 'miter' ? 'Miter' : !lineJoin
            ? inherited.strokeLineJoin
            : unsupported('stroke-linejoin', lineJoin),
        strokeLineWidth: parseNumber(properties['stroke-width'], inherited.strokeLineWidth, 'stroke-width'),
    };
}

function expandHex(value: string): string {
    return value.split('').map(character => character + character).join('');
}

function colorToCompose(value: string): string | null {
    const color = value.trim().toLowerCase();
    if (color === 'none' || color === 'transparent') return null;
    if (color === 'currentcolor' || color === 'context-fill' || color === 'context-stroke') {
        return 'Color(0xFF000000)';
    }

    const namedColors: Record<string, string> = {
        black: '000000',
        blue: '0000FF',
        green: '008000',
        red: 'FF0000',
        white: 'FFFFFF',
    };
    if (namedColors[color]) return `Color(0xFF${namedColors[color]})`;
    if (/^#[\da-f]{3}$/i.test(color)) return `Color(0xFF${expandHex(color.slice(1)).toUpperCase()})`;
    if (/^#[\da-f]{4}$/i.test(color)) {
        const rgba = expandHex(color.slice(1)).toUpperCase();
        return `Color(0x${rgba.slice(6, 8)}${rgba.slice(0, 6)})`;
    }
    if (/^#[\da-f]{6}$/i.test(color)) return `Color(0xFF${color.slice(1).toUpperCase()})`;
    if (/^#[\da-f]{8}$/i.test(color)) {
        const rgba = color.slice(1).toUpperCase();
        return `Color(0x${rgba.slice(6, 8)}${rgba.slice(0, 6)})`;
    }

    const rgb = color.match(/^rgba?\((.+)\)$/);
    if (rgb) {
        const parts = rgb[1]?.split(/[\s,\/]+/).filter(Boolean) ?? [];
        if (parts.length === 3 || parts.length === 4) {
            const channels = parts.slice(0, 3).map(part => {
                const channel = part.endsWith('%') ? Number(part.slice(0, -1)) * 2.55 : Number(part);
                if (!Number.isFinite(channel) || channel < 0 || channel > 255) {
                    throw new Error(`Invalid color channel in ${value}`);
                }
                return Math.round(channel);
            });
            const alphaPart = parts[3];
            const alpha = alphaPart === undefined
                ? 255
                : Math.round((alphaPart.endsWith('%') ? Number(alphaPart.slice(0, -1)) / 100 : Number(alphaPart)) * 255);
            if (!Number.isFinite(alpha) || alpha < 0 || alpha > 255) {
                throw new Error(`Invalid alpha channel in ${value}`);
            }
            const argb = [alpha, ...channels]
                .map(channel => channel.toString(16).padStart(2, '0'))
                .join('')
                .toUpperCase();
            return `Color(0x${argb})`;
        }
    }
    throw new Error(`Unsupported SVG color: ${value}`);
}

function number(value: number): string {
    if (!Number.isFinite(value)) throw new Error(`Invalid numeric value: ${value}`);
    return `${Object.is(value, -0) ? 0 : value}`;
}

function elementNumber(element: XmlElement, name: string, fallback = 0): number {
    return parseNumber(element.attributes[name], fallback, `${element.name}.${name}`);
}

function primitivePath(element: XmlElement): string {
    switch (element.name) {
        case 'path': {
            const data = element.attributes.d;
            if (!data) throw new Error('<path> is missing d');
            return data;
        }
        case 'circle': {
            const cx = elementNumber(element, 'cx');
            const cy = elementNumber(element, 'cy');
            const radius = elementNumber(element, 'r');
            if (radius < 0) throw new Error('<circle> radius cannot be negative');
            return `M ${number(cx + radius)} ${number(cy)} A ${number(radius)} ${number(radius)} 0 1 0 ${number(cx - radius)} ${number(cy)} A ${number(radius)} ${number(radius)} 0 1 0 ${number(cx + radius)} ${number(cy)} Z`;
        }
        case 'ellipse': {
            const cx = elementNumber(element, 'cx');
            const cy = elementNumber(element, 'cy');
            const rx = elementNumber(element, 'rx');
            const ry = elementNumber(element, 'ry');
            if (rx < 0 || ry < 0) throw new Error('<ellipse> radii cannot be negative');
            return `M ${number(cx + rx)} ${number(cy)} A ${number(rx)} ${number(ry)} 0 1 0 ${number(cx - rx)} ${number(cy)} A ${number(rx)} ${number(ry)} 0 1 0 ${number(cx + rx)} ${number(cy)} Z`;
        }
        case 'line':
            return `M ${number(elementNumber(element, 'x1'))} ${number(elementNumber(element, 'y1'))} L ${number(elementNumber(element, 'x2'))} ${number(elementNumber(element, 'y2'))}`;
        case 'polyline':
        case 'polygon': {
            const points = parseSvgNumberList(element.attributes.points ?? '');
            if (points.length < 2 || points.length % 2 !== 0) {
                throw new Error(`<${element.name}> points must contain coordinate pairs`);
            }
            const pairs: string[] = [];
            for (let index = 0; index < points.length; index += 2) {
                pairs.push(`${number(points[index] ?? Number.NaN)} ${number(points[index + 1] ?? Number.NaN)}`);
            }
            return `M ${pairs[0]} ${pairs.slice(1).map(pair => `L ${pair}`).join(' ')}${element.name === 'polygon' ? ' Z' : ''}`;
        }
        case 'rect': {
            const x = elementNumber(element, 'x');
            const y = elementNumber(element, 'y');
            const width = elementNumber(element, 'width');
            const height = elementNumber(element, 'height');
            if (width < 0 || height < 0) throw new Error('<rect> dimensions cannot be negative');
            const hasRx = element.attributes.rx !== undefined;
            const hasRy = element.attributes.ry !== undefined;
            let rx = elementNumber(element, 'rx', hasRy ? elementNumber(element, 'ry') : 0);
            let ry = elementNumber(element, 'ry', hasRx ? rx : 0);
            rx = Math.min(rx, width / 2);
            ry = Math.min(ry, height / 2);
            if (rx < 0 || ry < 0) throw new Error('<rect> corner radii cannot be negative');
            if (rx === 0 || ry === 0) {
                return `M ${number(x)} ${number(y)} H ${number(x + width)} V ${number(y + height)} H ${number(x)} Z`;
            }
            return `M ${number(x + rx)} ${number(y)} H ${number(x + width - rx)} A ${number(rx)} ${number(ry)} 0 0 1 ${number(x + width)} ${number(y + ry)} V ${number(y + height - ry)} A ${number(rx)} ${number(ry)} 0 0 1 ${number(x + width - rx)} ${number(y + height)} H ${number(x + rx)} A ${number(rx)} ${number(ry)} 0 0 1 ${number(x)} ${number(y + height - ry)} V ${number(y + ry)} A ${number(rx)} ${number(ry)} 0 0 1 ${number(x + rx)} ${number(y)} Z`;
        }
        default:
            throw new Error(`Unsupported SVG primitive: <${element.name}>`);
    }
}

function parseTransforms(value: string | undefined): Array<{ name: string; values: number[] }> {
    if (!value?.trim()) return [];
    const transforms: Array<{ name: string; values: number[] }> = [];
    let index = 0;
    while (index < value.length) {
        while (/[,\s]/.test(value[index] ?? '')) index += 1;
        const nameStart = index;
        while (/[a-z]/i.test(value[index] ?? '')) index += 1;
        const name = value.slice(nameStart, index).toLowerCase();
        while (/\s/.test(value[index] ?? '')) index += 1;
        if (!name || value[index] !== '(') throw new Error(`Invalid transform: ${value}`);
        index += 1;
        const argumentsStart = index;
        while (index < value.length && value[index] !== ')') index += 1;
        if (value[index] !== ')') throw new Error(`Unclosed transform: ${value}`);
        transforms.push({ name, values: parseSvgNumberList(value.slice(argumentsStart, index)) });
        index += 1;
    }
    return transforms;
}

function transformGroupArguments(transform: { name: string; values: number[] }): string {
    const values = transform.values;
    switch (transform.name) {
        case 'translate':
            if (values.length >= 1 && values.length <= 2) {
                return `translationX = ${number(values[0] ?? 0)}f, translationY = ${number(values[1] ?? 0)}f`;
            }
            break;
        case 'scale':
            if (values.length >= 1 && values.length <= 2) {
                return `scaleX = ${number(values[0] ?? 1)}f, scaleY = ${number(values[1] ?? values[0] ?? 1)}f`;
            }
            break;
        case 'rotate':
            if (values.length === 1 || values.length === 3) {
                return `rotate = ${number(values[0] ?? 0)}f, pivotX = ${number(values[1] ?? 0)}f, pivotY = ${number(values[2] ?? 0)}f`;
            }
            break;
        default:
            throw new Error(`Unsupported SVG transform: ${transform.name}`);
    }
    throw new Error(`Invalid ${transform.name} transform argument count: ${values.length}`);
}

function indentLines(value: string, indentation: string): string {
    return value.split('\n').map(line => `${indentation}${line}`).join('\n');
}

function renderPath(element: XmlElement, style: SvgStyle, indentation: string): string {
    const fill = colorToCompose(style.fill);
    const stroke = colorToCompose(style.stroke);
    if (!fill && !stroke) return '';
    const parameters = [
        `fill = ${fill ? `SolidColor(${fill})` : 'null'}`,
        `stroke = ${stroke ? `SolidColor(${stroke})` : 'null'}`,
        `fillAlpha = ${number(style.fillAlpha)}f`,
        `strokeAlpha = ${number(style.strokeAlpha)}f`,
        `strokeLineWidth = ${number(style.strokeLineWidth)}f`,
        `strokeLineCap = StrokeCap.${style.strokeLineCap}`,
        `strokeLineJoin = StrokeJoin.${style.strokeLineJoin}`,
        `pathFillType = PathFillType.${style.fillRule}`,
    ];
    return `${indentation}path(\n${parameters.map(parameter => `${indentation}    ${parameter}`).join(',\n')}\n${indentation}) {\n${convertPathDataToCompose(primitivePath(element), `${indentation}    `)}\n${indentation}}`;
}

const primitiveElements = new Set(['circle', 'ellipse', 'line', 'path', 'polygon', 'polyline', 'rect']);
const ignoredElements = new Set(['desc', 'metadata', 'title']);
const definitionElements = new Set(['defs', 'clippath', 'lineargradient', 'mask', 'pattern', 'radialgradient', 'symbol']);

function renderElement(element: XmlElement, inherited: SvgStyle, indentation: string, context: RenderContext): string {
    if (ignoredElements.has(element.name) || definitionElements.has(element.name)) return '';
    const style = resolveStyle(element, inherited);
    if (style.hidden) return '';

    let content: string;
    if (primitiveElements.has(element.name)) {
        content = renderPath(element, style, indentation);
    } else if (element.name === 'svg' || element.name === 'g' || element.name === 'a' || element.name === 'switch') {
        content = element.children
            .map(child => renderElement(child, style, indentation, context))
            .filter(Boolean)
            .join('\n\n');
    } else {
        throw new Error(`Unsupported SVG element: <${element.name}>`);
    }

    const transforms = parseTransforms(element.attributes.transform);
    for (let index = transforms.length - 1; index >= 0; index -= 1) {
        const transform = transforms[index];
        if (!transform || !content) continue;
        context.usesGroup = true;
        content = `${indentation}group(${transformGroupArguments(transform)}) {\n${indentLines(content, '    ')}\n${indentation}}`;
    }
    return content;
}

function parseViewBox(root: XmlElement): [number, number, number, number] {
    const viewBox = root.attributes.viewbox;
    if (viewBox) {
        const values = parseSvgNumberList(viewBox);
        if (values.length !== 4 || (values[2] ?? 0) <= 0 || (values[3] ?? 0) <= 0) {
            throw new Error(`Invalid viewBox: ${viewBox}`);
        }
        return values as [number, number, number, number];
    }
    const width = parseNumber(root.attributes.width, 24, 'svg.width');
    const height = parseNumber(root.attributes.height, 24, 'svg.height');
    return [0, 0, width, height];
}

export function svgToCompose(iconName: string, svgContent: string): string {
    const root = parseXml(svgContent);
    if (root.name !== 'svg') throw new Error(`Expected <svg> root, received <${root.name}>`);
    const [minX, minY, width, height] = parseViewBox(root);
    const composeName = toValidKotlinName(iconName);
    const privateVarName = `_${composeName.charAt(0).toLowerCase()}${composeName.slice(1)}`;
    const context: RenderContext = { usesGroup: false };
    let vectorContent = renderElement(root, defaultStyle, '        ', context);
    if (minX !== 0 || minY !== 0) {
        context.usesGroup = true;
        vectorContent = `        group(translationX = ${number(-minX)}f, translationY = ${number(-minY)}f) {\n${indentLines(vectorContent, '    ')}\n        }`;
    }
    if (!vectorContent.trim()) throw new Error(`SVG ${iconName} contains no visible supported elements`);

    const groupImport = context.usesGroup ? '\nimport androidx.compose.ui.graphics.vector.group' : '';
    const autoMirror = autoMirroredIcons.has(composeName) ? ',\n            autoMirror = true' : '';
    return `package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector${groupImport}
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.${composeName}: ImageVector
    get() {
        if (${privateVarName} != null) {
            return ${privateVarName}!!
        }
        ${privateVarName} = ImageVector.Builder(
            name = "${composeName}",
            defaultWidth = ${number(width)}.dp,
            defaultHeight = ${number(height)}.dp,
            viewportWidth = ${number(width)}f,
            viewportHeight = ${number(height)}f${autoMirror}
        ).apply {
${vectorContent}
        }.build()

        return ${privateVarName}!!
    }

private var ${privateVarName}: ImageVector? = null
`;
}

export { convertPathDataToCompose } from './path';
