# HugIcons Compose

[HugeIcons](https://hugeicons.com) for Jetpack Compose

## Installation

Make sure you have added the JitPack repository to your project-level `settings.gradle.kts` file:

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}
```

Then add the dependency to your app-level `build.gradle.kts` or `libs.versions.toml` file:
```gradle
implementation("com.github.rikkahub:hugeicons-compose:<<VERSION>>")
```

## Usage
```kotlin
@Composable
fun Greeting(name: String) {
    Column {
        Icon(HugeIcons.Earth, null)
        Icon(HugeIcons.CallMinus, null)
        Icon(HugeIcons.Searching, null)
    }
}
```
## RTL Support

Icons whose meaning follows the reading direction are built with `autoMirror = true`, so they flip
horizontally when `LocalLayoutDirection` is `LayoutDirection.Rtl` and look unchanged in LTR layouts.
The full list lives in [`library/gen/src/mirror.ts`](library/gen/src/mirror.ts).

You can check whether an icon mirrors itself with `ImageVector.autoMirror`:

```kotlin
HugeIcons.ArrowLeft01.autoMirror // true
HugeIcons.FastForward.autoMirror // false
```

If you previously flipped these icons yourself in RTL layouts, remove that code; otherwise they
will be flipped twice. To mirror an icon that is not on the list, flip it explicitly:

```kotlin
val isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl
Icon(
    imageVector = HugeIcons.ArrowUpRight01,
    contentDescription = null,
    modifier = Modifier.graphicsLayer { scaleX = if (isRtl) -1f else 1f },
)
```
