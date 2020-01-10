package com.xbees.testapp;

import android.app.Application;


import com.xbees.testapp.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public class MyApplication extends Application implements HasAndroidInjector {


    @Inject
    DispatchingAndroidInjector<Object> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
//        appComponent = DaggerAppComponent.builder().application().build();
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);

    }


    @Override
    public AndroidInjector<Object> androidInjector() {
        return dispatchingAndroidInjector;
    }
}
