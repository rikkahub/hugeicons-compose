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