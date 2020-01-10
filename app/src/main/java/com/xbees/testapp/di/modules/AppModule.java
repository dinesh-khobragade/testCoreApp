package com.xbees.testapp.di.modules;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module(includes = ViewModelModule.class)
public class AppModule {



   @Provides
    public Context getContext(Application application){
        return application.getApplicationContext();
    }




}
