# 8085 Simulator Android App (Starter)

This repository contains a starter Android app scaffold for building an 8085 simulator.

## Tech stack
- Kotlin
- Jetpack Compose
- Modular feature direction (CPU, Memory, Assembler, Debugger)

## Where to test this app
You can test it in any of these places:

1. **Android Studio Emulator (recommended)**
   - Open project in Android Studio.
   - Create an AVD from **Device Manager** (example: Pixel + Android 14/15 image).
   - Select the `app` run configuration and press **Run**.

2. **Physical Android phone**
   - Enable Developer Options + USB debugging.
   - Connect via USB.
   - Run from Android Studio, or use ADB install command after build.

3. **CLI build verification (local machine)**
   - Use a machine with Android SDK installed and `ANDROID_HOME` configured.
   - Run:
     ```bash
     ./gradlew :app:assembleDebug
     ```

## Local validation commands
Use these commands locally to validate:

```bash
./gradlew :app:assembleDebug
./gradlew :app:lint
./gradlew :app:testDebugUnitTest
```

## Current status in this environment
This repository was scaffolded successfully, but full Android build/test execution depends on local Android SDK + Gradle artifact resolution in your machine/CI.

## Next steps
- Split simulator logic into separate Gradle modules (`:core:cpu`, `:core:memory`, `:feature:debugger`, etc.).
- Add instruction decoder + execution unit in pure Kotlin.
- Add ViewModel-driven state for register/memory UI.
