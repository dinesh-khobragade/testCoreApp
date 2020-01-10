package com.xbees.testapp.di.builders;


import com.xbees.testapp.ui.TestFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract  class FragmentBuilderModule {

    @ContributesAndroidInjector
    abstract TestFragment getAddTaskFragment();


}
