# Yaji Grill Android Prototype

This workspace contains a starter Android application for the Yaji and Grill food delivery system described in the study. It includes three role-based modules:

- Customer module for placing orders and viewing delivery status
- Admin module for managing menu items
- Kitchen and delivery module for preparing and confirming deliveries

## Project structure
- [app/src/main/java/com/yajigrill](app/src/main/java/com/yajigrill) contains the app activities
- [app/src/main/res/layout](app/src/main/res/layout) contains the UI screens
- [app/build.gradle](app/build.gradle) contains the Android project configuration

## Build note
The project is configured for Gradle and Android Studio. A build verification run succeeded through Gradle task discovery, but producing an APK in this container is currently blocked by the absence of an Android SDK path.

## Next step
Open the project in Android Studio, install the Android SDK, and set the correct path in [local.properties](local.properties).
