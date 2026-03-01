# 8085 Simulator Android App (Starter)

This repository now contains a starter Android app scaffold for building an 8085 simulator.

## Tech stack
- Kotlin
- Jetpack Compose
- Modular feature direction (CPU, Memory, Assembler, Debugger)

## Run
1. Ensure Android SDK is installed and `ANDROID_HOME` is configured.
2. Run:
   ```bash
   ./gradlew :app:assembleDebug
   ```

## Next steps
- Split simulator logic into separate Gradle modules (`:core:cpu`, `:core:memory`, `:feature:debugger`, etc.).
- Add instruction decoder + execution unit in pure Kotlin.
- Add ViewModel-driven state for register/memory UI.
