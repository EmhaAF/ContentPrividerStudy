package com.lee.asher.contentprividerstudy;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * Created by lihong on 2017/9/13.
 */

public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Log.d("asher", "attachBaseContext: load");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("asher", "onCreate: application load");
    }
}
