package com.xbees.testapp.di;

import android.app.Application;


import com.xbees.testapp.MyApplication;
import com.xbees.testapp.di.builders.ActivityBuilderModule;
import com.xbees.testapp.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AppModule.class ,
        AndroidInjectionModule.class,
        ActivityBuilderModule.class
       })
public interface AppComponent {

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    void inject(MyApplication myApplication);

}
