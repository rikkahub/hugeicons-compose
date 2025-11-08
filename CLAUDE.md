# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 项目概述

这是一个将 HugeIcons (https://hugeicons.com) 图标库转换为 Jetpack Compose ImageVector 的 Android 库项目。项目包含两个主要模块:

- **library**: 核心图标库,包含 4500+ 个生成的 Compose 图标组件
- **app**: 演示应用程序
- **library/gen**: TypeScript/Bun 代码生成工具,用于从 HugeIcons API 自动生成 Kotlin 代码

## 构建与测试

### Android 项目
```bash
# 构建整个项目
./gradlew build

# 构建 library 模块
./gradlew :library:build

# 运行 app
./gradlew :app:installDebug

# 运行测试
./gradlew test
./gradlew :library:test
./gradlew :app:test

# 运行 Android instrumented 测试
./gradlew connectedAndroidTest
```

### 图标生成工具 (library/gen)
```bash
# 进入 gen 目录
cd library/gen

# 安装依赖 (首次运行)
bun install

# 重新生成所有图标
bun run gen
```

**注意**: 生成过程会:
1. 从 HugeIcons API 获取所有图标列表
2. 从 CDN 下载每个图标的 SVG 文件 (stroke-rounded 样式)
3. 将 SVG 转换为 Jetpack Compose ImageVector 代码
4. 输出到 `library/src/main/java/me/rerere/hugeicons/stroke/` 目录

## 代码架构

### 图标使用模式

所有图标都作为 `HugeIcons` 对象的扩展属性实现:

```kotlin
// 每个图标文件的结构
val HugeIcons.IconName: ImageVector
    get() {
        if (_iconName != null) {
            return _iconName!!
        }
        _iconName = ImageVector.Builder(...)
            .apply { path(...) }
            .build()
        return _iconName!!
    }

private var _iconName: ImageVector? = null
```

这种模式使用懒加载和缓存来优化性能,避免重复构建 ImageVector。

### 图标命名规则

- SVG 文件名采用 kebab-case (例如: `ai-search-02.svg`)
- Kotlin 属性名转换为 PascalCase (例如: `HugeIcons.AiSearch02`)
- 如果图标名以数字开头,添加 "Icon" 前缀 (例如: `01-key` → `HugeIcons.Icon01Key`)

### 代码生成工具 (library/gen)

**主要文件:**
- `src/main.ts`: 主程序入口,负责从 API 获取图标列表并批量处理
- `src/convert.ts`: SVG 到 Compose 的转换逻辑
  - `parseSvgPaths()`: 解析 SVG path 元素
  - `convertPathDataToCompose()`: 将 SVG path 命令转换为 Compose path DSL
  - `toValidKotlinName()`: 处理命名转换

**转换过程:**
1. 解析 SVG viewBox 和 path 元素
2. 将 SVG path 命令 (M/L/C/Q/A 等) 转换为对应的 Compose 方法
3. 生成包含完整 package/import/代码的 Kotlin 文件
4. 所有图标使用统一样式: 黑色描边、2f 线宽、Round cap/join

### Library 模块配置

**发布配置** (library/build.gradle.kts:52-64):
```kotlin
publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "me.rerere.hugeicons"
            artifactId = "hugeicons"
            version = "1.0"
            afterEvaluate {
                from(components["release"])
            }
        }
    }
}
```

已配置 Maven Publish 插件用于发布库。

**最低 SDK 要求:**
- minSdk: 24
- compileSdk: 36
- targetSdk: 36
- JVM Target: 11

## 开发注意事项

### 修改现有图标
不要手动编辑 `library/src/main/java/me/rerere/hugeicons/stroke/` 下的文件,这些都是自动生成的。如需更新:
1. 修改 `library/gen/src/convert.ts` 中的转换逻辑
2. 重新运行 `bun run gen`

### 添加新样式支持
目前仅支持 stroke-rounded 样式。要添加其他样式 (如 filled, duotone):
1. 在 library/src/main/java/me/rerere/hugeicons/ 下创建新的包 (如 `filled/`)
2. 修改 main.ts 中的 CDN URL 和输出路径
3. 可能需要调整 convert.ts 中的样式参数 (fill/stroke)

### 性能考虑
- 每个图标使用懒加载,只在首次访问时构建
- 使用私有可空变量缓存,避免重复构建
- 批量生成时并发处理,默认每批 10 个图标以避免 API 过载
