import { describe, expect, test } from 'bun:test';
import { existsSync } from 'fs';
import { join } from 'path';
import { convertPathDataToCompose, svgToCompose, toValidKotlinName } from './convert';
import { autoMirroredIcons } from './mirror';
import { parseXml } from './xml';

const internetSvg = `<svg width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
<circle cx="12" cy="12" r="10" stroke="#141B34" stroke-width="1.5"/>
<ellipse cx="12" cy="12" rx="4" ry="10" stroke="#141B34" stroke-width="1.5"/>
<path d="M2 12H22" stroke="#141B34" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/>
</svg>`;

describe('XML parsing', () => {
    test('parses element structure instead of depending on path tag formatting', () => {
        const root = parseXml(`<?xml version='1.0'?><svg viewBox='0 0 24 24'><g id='layer'><path stroke='red' d='M0 0'></path></g></svg>`);
        expect(root.name).toBe('svg');
        expect(root.attributes.viewbox).toBe('0 0 24 24');
        expect(root.children[0]?.name).toBe('g');
        expect(root.children[0]?.children[0]?.attributes.d).toBe('M0 0');
    });

    test('reports malformed nesting', () => {
        expect(() => parseXml('<svg><g></svg>')).toThrow('does not match');
    });
});

describe('SVG path parsing', () => {
    test('supports implicit line commands, adjacent signs, exponents, and close', () => {
        const code = convertPathDataToCompose('M1.5e1 2E-1 20-3z');
        expect(code).toContain('moveTo(15f, 0.2f)');
        expect(code).toContain('lineTo(20f, -3f)');
        expect(code).toContain('close()');
    });

    test('supports adjacent arc flags', () => {
        expect(convertPathDataToCompose('M0 0A5 5 0 0110 10')).toContain(
            'arcTo(5f, 5f, 0f, false, true, 10f, 10f)',
        );
    });

    test('rejects incomplete commands instead of generating invalid Kotlin', () => {
        expect(() => convertPathDataToCompose('M 1')).toThrow('expected a number');
        expect(() => convertPathDataToCompose('M0 0 X 1 1')).toThrow('unsupported path command: X');
    });
});

describe('SVG conversion', () => {
    test('converts every visible element in the Internet icon', () => {
        const code = svgToCompose('internet', internetSvg);
        expect(code.match(/        path\(/g)).toHaveLength(3);
        expect(code.match(/arcTo\(/g)).toHaveLength(4);
        expect(code).toContain('horizontalLineTo(22f)');
        expect(code).toContain('strokeLineWidth = 1.5f');
        expect(code).toContain('Color(0xFF141B34)');
    });

    test('supports all common SVG primitives and inherited inline styles', () => {
        const code = svgToCompose('primitives', `<svg viewBox="0 0 24 24" style="fill:none;stroke:currentColor;stroke-width:1.5;stroke-linecap:round">
            <rect x="1" y="1" width="4" height="4" rx="1"/>
            <line x1="1" y1="7" x2="5" y2="7"/>
            <polyline points="1,9 3,11 5,9"/>
            <polygon points="7,1 11,1 9,4"/>
            <circle cx="9" cy="9" r="2"/>
            <ellipse cx="16" cy="9" rx="3" ry="2"/>
            <path d="M14 14h4v4z"/>
        </svg>`);
        expect(code.match(/        path\(/g)).toHaveLength(7);
        expect(code).toContain('strokeLineCap = StrokeCap.Round');
        expect(code).toContain('close()');
    });

    test('supports common transforms and non-zero viewBox origins with vector groups', () => {
        const code = svgToCompose('transformed', `<svg viewBox="10 20 24 24"><g transform="translate(2 3) rotate(45 12 12)"><path d="M0 0L1 1"/></g></svg>`);
        expect(code).toContain('import androidx.compose.ui.graphics.vector.group');
        expect(code).toContain('translationX = -10f, translationY = -20f');
        expect(code).toContain('translationX = 2f, translationY = 3f');
        expect(code).toContain('rotate = 45f, pivotX = 12f, pivotY = 12f');
    });

    test('fails loudly for unsupported visible SVG features', () => {
        expect(() => svgToCompose('use', '<svg viewBox="0 0 24 24"><use href="#shape"/></svg>'))
            .toThrow('Unsupported SVG element: <use>');
        expect(() => svgToCompose('skew', '<svg viewBox="0 0 24 24"><path transform="skewX(10)" d="M0 0L1 1"/></svg>'))
            .toThrow('Unsupported SVG transform: skewx');
    });
});

describe('RTL auto mirroring', () => {
    test('marks listed directional icons as auto-mirrored', () => {
        const code = svgToCompose('arrow-left-01', internetSvg);
        expect(code).toContain('viewportHeight = 24f,\n            autoMirror = true\n        ).apply {');
    });

    test('leaves other icons unmirrored', () => {
        expect(svgToCompose('internet', internetSvg)).not.toContain('autoMirror');
    });

    test('only lists icons that exist in the generated sources', () => {
        const strokeDir = join(import.meta.dir, '../../src/main/java/me/rerere/hugeicons/stroke');
        const missing = [...autoMirroredIcons].filter(name => !existsSync(join(strokeDir, `${name}.kt`)));
        expect(missing).toEqual([]);
    });
});

test('creates valid Kotlin identifiers', () => {
    expect(toValidKotlinName('ai-search-02')).toBe('AiSearch02');
    expect(toValidKotlinName('01-key')).toBe('Icon01Key');
});
