import { writeFile, mkdir } from 'fs/promises';
import { join, resolve } from 'path';
import { svgToCompose, toValidKotlinName } from './convert';

// 图标接口定义
interface Icon {
    name: string;
    tags: string;
    category: string;
    featured: boolean;
    version: string;
}

interface CommandLineOptions {
    concurrency: number;
    iconNames: string[];
}

function parseCommandLine(args: string[]): CommandLineOptions {
    let concurrency = 32;
    const iconNames: string[] = [];

    for (const argument of args) {
        if (argument.startsWith('--concurrency=')) {
            const value = Number(argument.slice('--concurrency='.length));
            if (!Number.isInteger(value) || value < 1 || value > 128) {
                throw new Error(`并发数必须是 1 到 128 之间的整数: ${argument}`);
            }
            concurrency = value;
        } else if (argument.startsWith('--')) {
            throw new Error(`未知参数: ${argument}`);
        } else {
            iconNames.push(argument);
        }
    }

    return { concurrency, iconNames };
}

// 从 API 获取所有图标列表
async function fetchAllIcons(): Promise<Icon[]> {
    console.log('正在从 API 获取图标列表...');
    const url = 'https://hugeicons.com/api/icons';

    const response = await fetch(url);
    if (!response.ok) {
        throw new Error(`获取图标列表失败: ${response.status} ${response.statusText}`);
    }

    const data = await response.json() as { icons: Icon[] };
    console.log(`✓ 成功获取 ${data.icons.length} 个图标\n`);
    return data.icons;
}

// 从 CDN 下载 SVG
async function downloadSvg(iconName: string): Promise<string> {
    const url = `https://cdn.hugeicons.com/icons/${encodeURIComponent(iconName)}-stroke-rounded.svg?v=1.0.1`;

    const response = await fetch(url);
    if (!response.ok) {
        throw new Error(`下载失败: ${response.status} ${response.statusText}`);
    }

    const svgContent = await response.text();
    return svgContent;
}

// 处理单个图标
async function processIcon(iconName: string, outputDir: string): Promise<boolean> {
    try {
        // 1. 下载 SVG
        const svgContent = await downloadSvg(iconName);

        // 2. 转换为 Compose
        const composeCode = svgToCompose(iconName, svgContent);

        // 3. 生成文件名（kebab-case 转 PascalCase，确保不以数字开头）
        const fileName = toValidKotlinName(iconName);

        // 4. 保存 Compose 文件
        const composePath = join(outputDir, `${fileName}.kt`);
        await writeFile(composePath, composeCode);

        return true;
    } catch (error) {
        console.error(`✗ 处理 ${iconName} 失败:`, error instanceof Error ? error.message : error);
        return false;
    }
}

// 主函数
async function main() {
    console.log('=== HugeIcons 批量转换工具 ===\n');

    try {
        // 1. 无参数时获取全部图标；传入名称时只生成指定图标。
        const options = parseCommandLine(process.argv.slice(2));
        const iconNames = options.iconNames.length > 0
            ? options.iconNames
            : (await fetchAllIcons()).map(icon => icon.name);

        // 2. 创建输出目录（相对于项目根目录）
        const projectRoot = resolve(__dirname, '../../../');
        const outputDir = join(projectRoot, 'library/src/main/java/me/rerere/hugeicons/stroke');
        await mkdir(outputDir, { recursive: true });
        console.log(`输出目录: ${outputDir}\n`);

        // 3. 使用持续工作的并发池，单个请求完成后立即处理下一个图标。
        const workerCount = Math.min(options.concurrency, iconNames.length);
        console.log(`并发数: ${workerCount}\n`);
        let nextIndex = 0;
        let processed = 0;
        let failures = 0;

        const worker = async (): Promise<void> => {
            while (true) {
                const index = nextIndex;
                nextIndex += 1;
                const iconName = iconNames[index];
                if (iconName === undefined) return;

                const success = await processIcon(iconName, outputDir);
                processed += 1;
                if (!success) failures += 1;
                const failureText = failures > 0 ? `，失败 ${failures}` : '';
                console.log(`进度: ${processed}/${iconNames.length}${failureText} ${success ? '✓' : '✗'} ${iconName}`);
            }
        };

        await Promise.all(Array.from({ length: workerCount }, () => worker()));

        if (failures > 0) {
            throw new Error(`${failures} 个图标转换失败`);
        }

        console.log('✓ 所有图标转换完成!');
        console.log(`✓ 共处理 ${iconNames.length} 个图标`);
        console.log(`✓ 输出目录: ${outputDir}`);

    } catch (error) {
        console.error('\n✗ 错误:', error instanceof Error ? error.message : error);
        process.exit(1);
    }

    process.exit(0);
}

// 运行主函数
main();
