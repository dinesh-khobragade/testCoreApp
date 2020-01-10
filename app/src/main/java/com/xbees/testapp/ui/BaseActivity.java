package com.xbees.testapp.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.amitshekhar.DebugDB;
import com.xbees.testapp.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public class BaseActivity extends AppCompatActivity implements HasAndroidInjector {

    @Inject
    DispatchingAndroidInjector<Object> dispatchingAndroidInjector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DebugDB.getAddressLog();
        AndroidInjection.inject(this);
        setContentView(R.layout.base_activity);
//        AddTaskFragment.switchFragment(getSupportFragmentManager());
    }

    @Override
    public AndroidInjector<Object> androidInjector() {
        return dispatchingAndroidInjector;
    }
}
