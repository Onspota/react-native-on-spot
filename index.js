import { NativeModules, Platform, PermissionsAndroid } from 'react-native';

const { OnSpot } = NativeModules;

export default {
    async initTracker (userId, appKey) {
        if (Platform.OS == "ios") {
            OnSpot.initTracker(userId, appKey);
            return true;
        }
        //
        let hasPermission = await PermissionsAndroid.check(PermissionsAndroid.PERMISSIONS.ACCESS_FINE_LOCATION);
        if (hasPermission) {
            console.log('OnSpot has permission');
            OnSpot.initTracker(userId, appKey);
            return true;
        }
        //
        const granted = await PermissionsAndroid.request(PermissionsAndroid.PERMISSIONS.ACCESS_FINE_LOCATION, {title: 'OnSpot location Permission', message: 'For location based services', buttonPositive: 'OK'});
        if (granted === PermissionsAndroid.RESULTS.GRANTED) {
            console.log('OnSpot permission granted');
            OnSpot.initTracker(userId, appKey);
            return true;
        } else {
            console.log('OnSpot permission denied');
            return false;
        }
    }
};
