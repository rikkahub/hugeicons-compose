export interface XmlElement {
    name: string;
    attributes: Record<string, string>;
    children: XmlElement[];
}

const entities: Record<string, string> = {
    amp: '&',
    apos: "'",
    gt: '>',
    lt: '<',
    quot: '"',
};

function decodeEntities(value: string): string {
    return value.replace(/&(#x[\da-f]+|#\d+|[a-z]+);/gi, (entity, name: string) => {
        if (name.startsWith('#x')) {
            return String.fromCodePoint(Number.parseInt(name.slice(2), 16));
        }
        if (name.startsWith('#')) {
            return String.fromCodePoint(Number.parseInt(name.slice(1), 10));
        }
        return entities[name] ?? entity;
    });
}

function isWhitespace(character: string | undefined): boolean {
    return character !== undefined && /\s/.test(character);
}

function isNameCharacter(character: string | undefined): boolean {
    return character !== undefined && /[A-Za-z0-9_.:-]/.test(character);
}

export function parseXml(source: string): XmlElement {
    let index = 0;
    const roots: XmlElement[] = [];
    const stack: XmlElement[] = [];

    const fail = (message: string): never => {
        throw new Error(`Invalid XML at offset ${index}: ${message}`);
    };

    const skipWhitespace = (): void => {
        while (isWhitespace(source[index])) {
            index += 1;
        }
    };

    const readName = (): string => {
        const start = index;
        while (isNameCharacter(source[index])) {
            index += 1;
        }
        if (start === index) {
            fail('expected a name');
        }
        return source.slice(start, index).toLowerCase();
    };

    const skipUntil = (terminator: string): void => {
        const end = source.indexOf(terminator, index);
        if (end < 0) {
            fail(`missing ${terminator}`);
        }
        index = end + terminator.length;
    };

    while (index < source.length) {
        const opening = source.indexOf('<', index);
        if (opening < 0) {
            break;
        }
        index = opening;

        if (source.startsWith('<!--', index)) {
            index += 4;
            skipUntil('-->');
            continue;
        }
        if (source.startsWith('<?', index)) {
            index += 2;
            skipUntil('?>');
            continue;
        }
        if (source.startsWith('<![CDATA[', index)) {
            index += 9;
            skipUntil(']]>');
            continue;
        }
        if (source.startsWith('<!', index)) {
            index += 2;
            skipUntil('>');
            continue;
        }

        index += 1;
        if (source[index] === '/') {
            index += 1;
            skipWhitespace();
            const name = readName();
            skipWhitespace();
            if (source[index] !== '>') {
                fail('expected >');
            }
            index += 1;
            const element = stack.pop();
            if (element?.name !== name) {
                fail(`closing </${name}> does not match <${element?.name ?? 'none'}>`);
            }
            continue;
        }

        skipWhitespace();
        const element: XmlElement = {
            name: readName(),
            attributes: {},
            children: [],
        };

        let selfClosing = false;
        while (index < source.length) {
            skipWhitespace();
            if (source.startsWith('/>', index)) {
                index += 2;
                selfClosing = true;
                break;
            }
            if (source[index] === '>') {
                index += 1;
                break;
            }

            const attributeName = readName();
            skipWhitespace();
            if (source[index] !== '=') {
                fail(`expected = after ${attributeName}`);
            }
            index += 1;
            skipWhitespace();
            const quote = source[index];
            if (quote !== '"' && quote !== "'") {
                fail(`expected a quoted value for ${attributeName}`);
            }
            index += 1;
            const valueStart = index;
            while (index < source.length && source[index] !== quote) {
                index += 1;
            }
            if (source[index] !== quote) {
                fail(`unterminated value for ${attributeName}`);
            }
            element.attributes[attributeName] = decodeEntities(source.slice(valueStart, index));
            index += 1;
        }

        const parent = stack[stack.length - 1];
        if (parent) {
            parent.children.push(element);
        } else {
            roots.push(element);
        }
        if (!selfClosing) {
            stack.push(element);
        }
    }

    if (stack.length > 0) {
        fail(`unclosed <${stack[stack.length - 1]?.name}>`);
    }
    if (roots.length !== 1) {
        fail(`expected one root element, found ${roots.length}`);
    }
    const root = roots[0];
    if (!root) {
        fail('missing root element');
    }
    return root!;
}
