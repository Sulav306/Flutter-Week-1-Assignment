# week1_assignment

A new Flutter project assignment where we have to make changes to our project name and also change our profile picture.

For the second assignment, the existing application was extended to support three separate build flavors: development, staging, and production. These were set up as follows:

dev: MyApp-Dev (used during development and testing)
staging: MyApp-Staging (used for pre-release validation)
prod: MyApp-Prod (the main production version)
To implement this, research was first carried out on app flavors using resources from pub.dev. After understanding the concept, the latest version of flutter_flavorizr was added to the project’s pubspec.yaml file under dev_dependencies.

Once added, flutter pub get was executed to fetch and install the package.

Next, the Flavorizr configuration was defined inside pubspec.yaml, where all three flavors were set up with distinct application names. Each flavor was also given a unique applicationId, ensuring that all versions could coexist and be installed simultaneously on the same device without conflicts.

Whenever changes were made to the Flavorizr setup, the configuration needed to be regenerated using the following command:

dart run flutter_flavorizr

After setup, each flavor could be launched separately using these commands:

Dev: flutter run --flavor dev
Staging: flutter run --flavor staging
Prod: flutter run --flavor prod

Running these commands confirmed that all three versions were successfully created and could run independently. To make them easier to distinguish, different app icons were also assigned to the dev and staging flavors.


## Getting Started

This project is a starting point for a Flutter application.

A few resources to get you started if this is your first Flutter project:

- [Lab: Write your first Flutter app](https://docs.flutter.dev/get-started/codelab)
- [Cookbook: Useful Flutter samples](https://docs.flutter.dev/cookbook)

For help getting started with Flutter development, view the
[online documentation](https://docs.flutter.dev/), which offers tutorials,
samples, guidance on mobile development, and a full API reference.
