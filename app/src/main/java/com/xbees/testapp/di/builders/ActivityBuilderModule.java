package com.xbees.testapp.di.builders;


import com.xbees.testapp.ui.BaseActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @SuppressWarnings("unused")
    @ContributesAndroidInjector(modules = FragmentBuilderModule.class)
    abstract BaseActivity baseActivity();


}
