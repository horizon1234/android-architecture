package com.example.android.architecture.blueprints.todoapp;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by zyh on 2018/9/11.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
