// 将 kebab-case 转换为合法的 Kotlin PascalCase 标识符
// 如果以数字开头，添加 "Icon" 前缀
export function toValidKotlinName(iconName: string): string {
    const pascalCase = iconName
        .split('-')
        .map(part => part.charAt(0).toUpperCase() + part.slice(1))
        .join('');

    // 检查是否以数字开头
    if (/^\d/.test(pascalCase)) {
        return 'Icon' + pascalCase;
    }

    return pascalCase;
}

// 解析 SVG 路径数据
export function parseSvgPaths(svgContent: string): { paths: string[], viewBox: string } {
    const viewBoxMatch = svgContent.match(/viewBox="([^"]+)"/);
    const viewBox = (viewBoxMatch && viewBoxMatch[1]) ? viewBoxMatch[1] : "0 0 24 24";

    const pathRegex = /<path[^>]*d="([^"]+)"[^>]*\/>/g;
    const paths: string[] = [];
    let match;

    while ((match = pathRegex.exec(svgContent)) !== null) {
        if (match[1]) {
            paths.push(match[1]);
        }
    }

    return { paths, viewBox };
}

// 将 SVG 转换为 Jetpack Compose 代码（扩展属性格式）
export function svgToCompose(iconName: string, svgContent: string): string {
    const { paths, viewBox } = parseSvgPaths(svgContent);
    const [, , width, height] = viewBox.split(' ').map(Number);

    // 生成 Compose 代码
    // 将 kebab-case 的图标名转换为 PascalCase
    // 例如: ai-search-02 -> AiSearch02, 01-key -> Icon01Key
    const composeName = toValidKotlinName(iconName);

    let pathsCode = paths.map((pathData) => {
        return `        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
${convertPathDataToCompose(pathData)}
        }`;
    }).join('\n\n');

    const privateVarName = '_' + composeName.charAt(0).toLowerCase() + composeName.slice(1);

    return `package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
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
            defaultWidth = ${width}.dp,
            defaultHeight = ${height}.dp,
            viewportWidth = ${width}f,
            viewportHeight = ${height}f
        ).apply {
${pathsCode}
        }.build()

        return ${privateVarName}!!
    }

private var ${privateVarName}: ImageVector? = null
`;
}

// 转换 SVG path 数据为 Compose 命令
export function convertPathDataToCompose(pathData: string): string {
    // 解析 SVG path 命令
    const commands: string[] = [];

    // 清理并分割路径数据
    const cleanPath = pathData.trim();

    // 使用正则表达式匹配 path 命令
    const commandRegex = /([MmLlHhVvCcSsQqTtAaZz])([\d\s,.-]*)/g;
    let match;
    let firstPoint = true;

    while ((match = commandRegex.exec(cleanPath)) !== null) {
        const cmd = match[1];
        const paramsStr = match[2] || '';
        const params = paramsStr.trim()
            .replace(/,/g, ' ')
            .split(/\s+/)
            .filter(p => p.length > 0)
            .map(p => parseFloat(p));

        let i = 0;
        while (i < params.length) {
            switch (cmd) {
                case 'M': // moveTo absolute
                    if (firstPoint) {
                        commands.push(`moveTo(${params[i]}f, ${params[i+1]}f)`);
                        firstPoint = false;
                    } else {
                        commands.push(`moveTo(${params[i]}f, ${params[i+1]}f)`);
                    }
                    i += 2;
                    break;
                case 'm': // moveTo relative
                    commands.push(`moveToRelative(${params[i]}f, ${params[i+1]}f)`);
                    i += 2;
                    break;
                case 'L': // lineTo absolute
                    commands.push(`lineTo(${params[i]}f, ${params[i+1]}f)`);
                    i += 2;
                    break;
                case 'l': // lineTo relative
                    commands.push(`lineToRelative(${params[i]}f, ${params[i+1]}f)`);
                    i += 2;
                    break;
                case 'H': // horizontal line absolute
                    commands.push(`horizontalLineTo(${params[i]}f)`);
                    i += 1;
                    break;
                case 'h': // horizontal line relative
                    commands.push(`horizontalLineToRelative(${params[i]}f)`);
                    i += 1;
                    break;
                case 'V': // vertical line absolute
                    commands.push(`verticalLineTo(${params[i]}f)`);
                    i += 1;
                    break;
                case 'v': // vertical line relative
                    commands.push(`verticalLineToRelative(${params[i]}f)`);
                    i += 1;
                    break;
                case 'C': // cubic bezier absolute
                    commands.push(`curveTo(${params[i]}f, ${params[i+1]}f, ${params[i+2]}f, ${params[i+3]}f, ${params[i+4]}f, ${params[i+5]}f)`);
                    i += 6;
                    break;
                case 'c': // cubic bezier relative
                    commands.push(`curveToRelative(${params[i]}f, ${params[i+1]}f, ${params[i+2]}f, ${params[i+3]}f, ${params[i+4]}f, ${params[i+5]}f)`);
                    i += 6;
                    break;
                case 'S': // smooth cubic bezier absolute
                    commands.push(`reflectiveCurveTo(${params[i]}f, ${params[i+1]}f, ${params[i+2]}f, ${params[i+3]}f)`);
                    i += 4;
                    break;
                case 's': // smooth cubic bezier relative
                    commands.push(`reflectiveCurveToRelative(${params[i]}f, ${params[i+1]}f, ${params[i+2]}f, ${params[i+3]}f)`);
                    i += 4;
                    break;
                case 'Q': // quadratic bezier absolute
                    commands.push(`quadTo(${params[i]}f, ${params[i+1]}f, ${params[i+2]}f, ${params[i+3]}f)`);
                    i += 4;
                    break;
                case 'q': // quadratic bezier relative
                    commands.push(`quadToRelative(${params[i]}f, ${params[i+1]}f, ${params[i+2]}f, ${params[i+3]}f)`);
                    i += 4;
                    break;
                case 'T': // smooth quadratic bezier absolute
                    commands.push(`reflectiveQuadTo(${params[i]}f, ${params[i+1]}f)`);
                    i += 2;
                    break;
                case 't': // smooth quadratic bezier relative
                    commands.push(`reflectiveQuadToRelative(${params[i]}f, ${params[i+1]}f)`);
                    i += 2;
                    break;
                case 'A': // arc absolute
                    commands.push(`arcTo(${params[i]}f, ${params[i+1]}f, ${params[i+2]}f, ${params[i+3] !== 0}, ${params[i+4] !== 0}, ${params[i+5]}f, ${params[i+6]}f)`);
                    i += 7;
                    break;
                case 'a': // arc relative
                    commands.push(`arcToRelative(${params[i]}f, ${params[i+1]}f, ${params[i+2]}f, ${params[i+3] !== 0}, ${params[i+4] !== 0}, ${params[i+5]}f, ${params[i+6]}f)`);
                    i += 7;
                    break;
                case 'Z':
                case 'z': // close path
                    commands.push('close()');
                    i = params.length; // 结束当前命令
                    break;
                default:
                    i = params.length; // 跳过未知命令
            }
        }
    }

    return commands.map(cmd => `        ${cmd}`).join('\n');
}
