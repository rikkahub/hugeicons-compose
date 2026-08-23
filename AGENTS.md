# Repository Guidelines

## Project Structure & Module Organization

This Kotlin/Android Gradle project has two modules. `library/` contains the published Compose library; `HugeIcons.kt` is its marker object and generated icons live under `library/src/main/java/me/rerere/hugeicons/stroke/`. `app/` previews icons for manual checks. Tests use each module's `src/test/java/` and `src/androidTest/java/` trees. Dependency versions are in `gradle/libs.versions.toml`; the Bun SVG converter is in `library/gen/`.

## Build, Test, and Development Commands

The wrapper is not executable in the repository, so invoke it through Bash:

- `bash ./gradlew build` — compile both modules and run standard checks.
- `bash ./gradlew :app:assembleDebug` — build the sample debug APK.
- `bash ./gradlew test` — run all local JVM unit tests.
- `bash ./gradlew connectedAndroidTest` — test on a connected emulator or device.
- `bash ./gradlew lint` — run Android lint across the project.
- `cd library/gen && bun install && bun run gen` — download SVGs and regenerate stroke sources. This requires network access and rewrites many files; inspect the diff.

## Coding Style & Naming Conventions

Use four-space indentation, Android Studio formatting, explicit imports, and Java 11 compatibility. Classes, composables, and icon properties use `PascalCase`; functions and values use `lowerCamelCase`. An icon file matches its property: `CameraOff02.kt` defines `HugeIcons.CameraOff02` and a private lower-camel `ImageVector` cache. Fix repeated output issues in the generator instead of editing generated files individually. No ktlint or Detekt setup exists; compilation and Android lint are the style gates.

## Testing Guidelines

Local tests use JUnit 4; instrumented tests use AndroidX Test and Espresso. Name classes `*Test.kt`, mirror production packages, and use descriptive methods such as `generatedIcon_hasExpectedViewport`. Use JVM tests for pure logic and device/Compose tests for rendering or Android integration. No coverage threshold is enforced, but changes should include focused regression tests.

## Commit & Pull Request Guidelines

History uses short subjects in English or Chinese. Prefer specific, imperative wording such as `Fix arc conversion for relative paths`, and separate generated updates from unrelated changes. Pull requests should explain scope, list verification commands, link issues, and include screenshots for sample-app visual changes. For regenerated icons, name the upstream source/version and summarize the diff.

## Configuration & Safety

Do not commit `local.properties`, SDK paths, credentials, or build directories. Treat upstream SVG/API content as external input and inspect generated changes before merging.
