# Scientific Calculator Android App

## Description and Purpose of the Application

The Scientific Calculator Android App is a prototype designed for Android operating systems that allows users to customize their experience based on their preferences and settings. Developed using Android Studio, with Gradle version 4.10.0 or higher, SDK version 23 or higher, and build tools version 24.0.3, this application provides a comprehensive suite of arithmetic and scientific calculation functions.

## Key Features
- Basic Arithmetic Operations: Addition (+), subtraction (-), multiplication (*), division (/), and modulus (%) for both whole and fractional numbers (positive and negative).
  
- Memory Functions: Includes buttons for storing (M+), recalling (MR), and canceling (MC) memory values.
  
- Trigonometric Calculations: Functions for sine (sin), cosine (cos), tangent (tan), inverse sine (sin⁻¹), inverse cosine (cos⁻¹), and inverse tangent (tan⁻¹).

- Base Conversion: Convert numbers between decimal (base 10) and binary.

- Advanced Mathematical Operations: Includes reciprocal (1/x), power (x^y), root (x^(1/y)), logarithm base 10 (log10), exponential (10^x), natural logarithm (ln), and exponential function (e^x).
  
- Customizable Preferences: Users can customize the appearance and settings of the app via the action overflow menu.
  
- Help Feature: Integrated help section to assist users with the app’s features and functions.
  
## Frameworks and Technologies

- Android Studio
- Gradle: Version 4.10.0 or higher
- SDK: Android SDK version 23 or higher
- Build Tools: Version 24.0.3
  
## Class Diagram Models
 _The app consists of four classes:_

- **MainActivity** : The primary activity that launches the app and serves as the parent class.
  
- **Activity2, Activity3, Activity4** : Additional activities launched from the main activity, each handling different aspects of the app’s functionality.
  
## User Interface Screenshots
1. Main Interface
 Main Calculator Interface

![Main Act](https://github.com/IzzyDevOps/Scientific-Calculator/assets/147671694/8b22b6dd-2182-4937-bf0c-4db0f5068ba8)


- _Shows the main screen of the scientific calculator app, highlighting basic arithmetic operations and the display area._

2. Advanced Mathematical Operations
Advanced Mathematical Operations

![Calculate Activity](https://github.com/IzzyDevOps/Scientific-Calculator/assets/147671694/04ee40d6-2253-4565-b9bd-422da19e036c)


- _Shows advanced functions like 1/x, x^y, log10, etc._

3. Preferences and Settings
Preferences and Settings Menu

![Settings Act](https://github.com/IzzyDevOps/Scientific-Calculator/assets/147671694/1aecb868-f5e8-4f68-949c-d4539ff7d9b3)


- _Shows the settings menu for customizing the app’s appearance and preferences._


4. Help Feature

![Help Act](https://github.com/IzzyDevOps/Scientific-Calculator/assets/147671694/0228f02a-847b-42e3-8254-e72f7ab0bfdb)


- _Illustrates the help section that provides information about the app’s features._


## Development and Implementation

### Setup Development Environment

1. Install Android Studio: Ensure you have the latest version installed.
2. Configure Gradle: Use version 4.10.0 or higher.
3. SDK Version: Ensure the SDK version is 23 or higher.
4. Build Tools: Use version 24.0.3.
   
### Design and Implementation Steps

1. User Interface Design:

- Design the layout for basic and scientific functions.
- Implement MainActivity and additional activities (Activity2, Activity3, Activity4) for different functionalities.
  
2. Implement Core Features:

- Basic arithmetic operations, memory functions, and user notifications.
- Trigonometric, base conversion, and advanced mathematical operations.
  
3. Add Customization and Help Features:

- Preferences for customizing appearance and settings.
- Integrated help section for user guidance.

4. Testing and Debugging:

- Test on various devices and Android versions.
- Optimize performance and fix bugs.

## How to Run and Deploy

### Prerequisites

- Android Studio: Ensure it's installed and configured.
- Understanding of Android Development: Basic knowledge is required.
  
### Deployment Steps

1. Download the Project Files:

- Download the Scientific Calculator Project Files

2. Open the Project in Android Studio:

- Launch Android Studio and select “Open an Existing Project.”
- Navigate to the downloaded project folder and open it.
  
3. Build the Project:

- Go to “Build” > “Make Project” to compile the code and build the APK.
Run the App:

4. Connect an Android device or use an emulator.
   
- Click on the “Run” button in Android Studio to deploy the app to the device.

5. Test the App:

- Test the app on the device/emulator to ensure that all features work as expected.
