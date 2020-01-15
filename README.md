# react-native-on-spot

## Getting started

`$ npm install react-native-on-spot --save`

### Mostly automatic installation
(Optional): If you using a version of react-native < 60, then you have to make a link as follows:
`$ react-native link react-native-on-spot`

## Usage
```javascript
import OnSpot from 'react-native-on-spot';

OnSpot.initTracker('userId', 'appId');
```
# Android SDK requirements

The minimum Android version for the SDK is Android 6.0 Marshmallow (API 21).
Beacon detection will only work on devices which have support for Bluetooth Low Energy (Bluetooth 4.0). We may add support for Android 4.0 on future versions.

OnSpota's SDK uses Google play services.

## Permissions

For WiFi, geo-location and beacon scanning (starting with Android 6.0) you need to add these permissions:

    android.permission.RECEIVE_BOOT_COMPLETED
    android.permission.BLUETOOTH
    android.permission.BLUETOOTH_ADMIN
    android.permission.INTERNET
    android.permission.ACCESS_FINE_LOCATION
    android.permission.ACCESS_WIFI_STATE
    android.permission.CHANGE_WIFI_STATE

# Install

## Android Studio

1. Follow the general Android install process, under the android folder.

2. Add bintray's maven  repository to the project's build.gradle file:
```
	repositories {
		maven {
			url  "https://dl.bintray.com/tomerassist/OnSpotSdk"
		}
	}
```

3. Check your ```targetSdkVersion``` 

    It is recommended that your TargetSDkVersion will be 21 or higher.
    Please notice that on Android 8.0 (Oreo) or higher the SDK may be less accurate when running in the background.
    
4. Multidex support 

The OnSpot React Native SDK requires multidex support. For additional information, please refer to [multidex support for Android](https://medium.com/@aungmt/multidex-on-androidx-for-rn-0-60-x-cbb37c50d85).

# Using

1. Request your AppID by support@onspota.com

2. Set your AppID in the AndroidManifest.xml:

		<meta-data
			android:name="com.onspota.sdk.ApplicationId"
			android:value="XXXXXXXXXXX" />

3. Request granted permissions for Manifest.permission.ACCESS_FINE_LOCATION

Copyright (c) 2020 OnSpot@ AG. All rights reserved.
