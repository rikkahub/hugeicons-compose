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
    const url = `https://cdn.hugeicons.com/icons/${iconName}-stroke-rounded.svg?v=1.0.1`;

    const response = await fetch(url);
    if (!response.ok) {
        throw new Error(`下载失败: ${response.status} ${response.statusText}`);
    }

    const svgContent = await response.text();
    return svgContent;
}

// 处理单个图标
async function processIcon(icon: Icon, outputDir: string): Promise<void> {
    try {
        // 1. 下载 SVG
        const svgContent = await downloadSvg(icon.name);

        // 2. 转换为 Compose
        const composeCode = svgToCompose(icon.name, svgContent);

        // 3. 生成文件名（kebab-case 转 PascalCase，确保不以数字开头）
        const fileName = toValidKotlinName(icon.name);

        // 4. 保存 Compose 文件
        const composePath = join(outputDir, `${fileName}.kt`);
        await writeFile(composePath, composeCode);

        console.log(`✓ ${icon.name} -> ${fileName}.kt`);
    } catch (error) {
        console.error(`✗ 处理 ${icon.name} 失败:`, error instanceof Error ? error.message : error);
    }
}

// 主函数
async function main() {
    console.log('=== HugeIcons 批量转换工具 ===\n');

    try {
        // 1. 获取所有图标
        const icons = await fetchAllIcons();

        // 2. 创建输出目录（相对于项目根目录）
        const projectRoot = resolve(__dirname, '../../../');
        const outputDir = join(projectRoot, 'library/src/main/java/me/rerere/hugeicons/stroke');
        await mkdir(outputDir, { recursive: true });
        console.log(`输出目录: ${outputDir}\n`);

        // 3. 处理所有图标（并发处理，但限制并发数避免过载）
        const batchSize = 10; // 每批处理 10 个图标
        let processed = 0;

        for (let i = 0; i < icons.length; i += batchSize) {
            const batch = icons.slice(i, i + batchSize);
            await Promise.all(batch.map(icon => processIcon(icon, outputDir)));
            processed += batch.length;
            console.log(`进度: ${processed}/${icons.length}\n`);
        }

        console.log('✓ 所有图标转换完成!');
        console.log(`✓ 共处理 ${icons.length} 个图标`);
        console.log(`✓ 输出目录: ${outputDir}`);

    } catch (error) {
        console.error('\n✗ 错误:', error instanceof Error ? error.message : error);
        process.exit(1);
    }

    process.exit(0);
}

// 运行主函数
main();
