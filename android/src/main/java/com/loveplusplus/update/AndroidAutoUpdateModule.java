package com.loveplusplus.update;



import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.util.Log;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.core.DeviceEventManagerModule;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

public class AndroidAutoUpdateModule extends ReactContextBaseJavaModule implements LifecycleEventListener{

    public AndroidAutoUpdateModule(ReactApplicationContext reactContext) {
        super(reactContext);
        final ReactApplicationContext ctx = reactContext;
        ctx.addLifecycleEventListener(this);
    }

    @Override
    public String getName() {
        return "AndroidAutoUpdate";
    }


    @ReactMethod
    public void goToDownloadApk(url) {
        final Activity activity = getCurrentActivity();
        if (activity == null) {
            return;
        }
        UpdateDialog.goToDownload(activity,url);
    }


    @ReactMethod
    public void getAppVersionCode(Callback callback) {
	    int versionCode = AppUtils.getVersionCode(mContext);
		callback.invoke(versionCode);
    }

    @Override
    public @Nullable Map<String, Object> getConstants() {
        HashMap<String, Object> constants = new HashMap<String, Object>();

        return constants;
    }

    @Override
    public void onHostResume() {

    }
    @Override
    public void onHostPause() {

    }

    @Override
    public void onHostDestroy() {
    }
}