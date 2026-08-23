type PathCommand = 'A' | 'C' | 'H' | 'L' | 'M' | 'Q' | 'S' | 'T' | 'V' | 'Z';

const parameterTypes: Record<Exclude<PathCommand, 'Z'>, Array<'number' | 'flag'>> = {
    A: ['number', 'number', 'number', 'flag', 'flag', 'number', 'number'],
    C: ['number', 'number', 'number', 'number', 'number', 'number'],
    H: ['number'],
    L: ['number', 'number'],
    M: ['number', 'number'],
    Q: ['number', 'number', 'number', 'number'],
    S: ['number', 'number', 'number', 'number'],
    T: ['number', 'number'],
    V: ['number'],
};

function isCommand(character: string | undefined): boolean {
    return character !== undefined && /[AaCcHhLlMmQqSsTtVvZz]/.test(character);
}

function formatNumber(value: number): string {
    if (!Number.isFinite(value)) {
        throw new Error(`Invalid path number: ${value}`);
    }
    return `${Object.is(value, -0) ? 0 : value}f`;
}

class PathScanner {
    private index = 0;

    constructor(private readonly source: string) {}

    get position(): number {
        return this.index;
    }

    get done(): boolean {
        this.skipSeparators();
        return this.index >= this.source.length;
    }

    peek(): string | undefined {
        this.skipSeparators();
        return this.source[this.index];
    }

    readCommand(): string {
        this.skipSeparators();
        const command = this.source[this.index];
        if (!isCommand(command)) {
            this.fail('expected a path command');
        }
        this.index += 1;
        return command!;
    }

    readNumber(): number {
        this.skipSeparators();
        if (/[A-Za-z]/.test(this.source[this.index] ?? '')) {
            this.fail(`unsupported path command: ${this.source[this.index]}`);
        }
        const start = this.index;
        if (this.source[this.index] === '+' || this.source[this.index] === '-') {
            this.index += 1;
        }

        let digits = 0;
        while (/\d/.test(this.source[this.index] ?? '')) {
            this.index += 1;
            digits += 1;
        }
        if (this.source[this.index] === '.') {
            this.index += 1;
            while (/\d/.test(this.source[this.index] ?? '')) {
                this.index += 1;
                digits += 1;
            }
        }
        if (digits === 0) {
            this.fail('expected a number');
        }

        if (this.source[this.index] === 'e' || this.source[this.index] === 'E') {
            this.index += 1;
            if (this.source[this.index] === '+' || this.source[this.index] === '-') {
                this.index += 1;
            }
            const exponentStart = this.index;
            while (/\d/.test(this.source[this.index] ?? '')) {
                this.index += 1;
            }
            if (exponentStart === this.index) {
                this.fail('expected exponent digits');
            }
        }

        const value = Number(this.source.slice(start, this.index));
        if (!Number.isFinite(value)) {
            this.fail('invalid number');
        }
        return value;
    }

    readFlag(): number {
        this.skipSeparators();
        const flag = this.source[this.index];
        if (flag !== '0' && flag !== '1') {
            this.fail('arc flags must be 0 or 1');
        }
        this.index += 1;
        return Number(flag);
    }

    fail(message: string): never {
        throw new Error(`Invalid SVG path at offset ${this.index}: ${message}`);
    }

    private skipSeparators(): void {
        while (this.index < this.source.length) {
            const character = this.source[this.index];
            if (character === ',' || /\s/.test(character ?? '')) {
                this.index += 1;
            } else {
                break;
            }
        }
    }
}

function composeCommand(command: string, values: number[], firstMove: boolean): string {
    const relative = command === command.toLowerCase();
    const upper = command.toUpperCase() as PathCommand;
    const number = (index: number): string => formatNumber(values[index] ?? Number.NaN);
    const suffix = relative ? 'Relative' : '';

    switch (upper) {
        case 'M':
            return `${firstMove ? 'moveTo' : 'lineTo'}${suffix}(${number(0)}, ${number(1)})`;
        case 'L':
            return `lineTo${suffix}(${number(0)}, ${number(1)})`;
        case 'H':
            return `horizontalLineTo${suffix}(${number(0)})`;
        case 'V':
            return `verticalLineTo${suffix}(${number(0)})`;
        case 'C':
            return `curveTo${suffix}(${values.map(formatNumber).join(', ')})`;
        case 'S':
            return `reflectiveCurveTo${suffix}(${values.map(formatNumber).join(', ')})`;
        case 'Q':
            return `quadTo${suffix}(${values.map(formatNumber).join(', ')})`;
        case 'T':
            return `reflectiveQuadTo${suffix}(${values.map(formatNumber).join(', ')})`;
        case 'A':
            return `arcTo${suffix}(${number(0)}, ${number(1)}, ${number(2)}, ${values[3] === 1}, ${values[4] === 1}, ${number(5)}, ${number(6)})`;
        case 'Z':
            return 'close()';
    }
}

export function parseSvgNumberList(value: string): number[] {
    const scanner = new PathScanner(value);
    const numbers: number[] = [];
    while (!scanner.done) {
        numbers.push(scanner.readNumber());
    }
    return numbers;
}

export function convertPathDataToCompose(pathData: string, indentation = '        '): string {
    const scanner = new PathScanner(pathData);
    const commands: string[] = [];
    let currentCommand: string | undefined;

    while (!scanner.done) {
        if (isCommand(scanner.peek())) {
            currentCommand = scanner.readCommand();
        } else if (!currentCommand || currentCommand.toUpperCase() === 'Z') {
            scanner.fail('missing a path command');
        }

        const command = currentCommand ?? scanner.fail('missing a path command');
        const upper = command.toUpperCase() as PathCommand;
        if (upper === 'Z') {
            commands.push('close()');
            currentCommand = undefined;
            continue;
        }

        const types = parameterTypes[upper as Exclude<PathCommand, 'Z'>];
        let segment = 0;
        do {
            const values = types.map(type => type === 'flag' ? scanner.readFlag() : scanner.readNumber());
            commands.push(composeCommand(command, values, segment === 0));
            segment += 1;
        } while (!scanner.done && !isCommand(scanner.peek()));
    }

    return commands.map(command => `${indentation}${command}`).join('\n');
}
