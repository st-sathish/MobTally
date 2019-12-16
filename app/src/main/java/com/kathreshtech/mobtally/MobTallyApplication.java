package com.kathreshtech.mobtally;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;

public class MobTallyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidNetworking.initialize(getApplicationContext());
    }
}
