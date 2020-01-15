package com.OnSpotSdk;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.onspota.sdk.OnspotaApi;


public class OnSpotModule extends ReactContextBaseJavaModule {
    private static final String TAG = OnSpotModule.class.getSimpleName();
    private OnspotaApi api;
    private String onSpotUserId, onSpotApiKey;
    
    private final ReactApplicationContext reactContext;
    
    public OnSpotModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }
    
    @Override
    public String getName() {
        return "OnSpot";
    }
    
    @ReactMethod
    public void initTracker(String userId, String apiKey) {
        onSpotUserId = userId;
        onSpotApiKey = apiKey;
        
        initOnSpot();
    }
    
    private void initOnSpot() {
        api = new OnspotaApi(getCurrentActivity());
        Log.d(TAG, "initOnSpot: " + api.start(onSpotUserId, onSpotApiKey));
    }
}
