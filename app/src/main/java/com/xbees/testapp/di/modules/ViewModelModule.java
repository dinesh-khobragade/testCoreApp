package com.xbees.testapp.di.modules;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;


import com.xbees.testapp.ui.TestViewModel;
import com.xbees.testapp.ui.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(TestViewModel.class)
    @SuppressWarnings("unused")
    abstract ViewModel bindsArticleDetailsiewModel(TestViewModel testViewModel);


    @Binds
    @SuppressWarnings("unused")
    abstract ViewModelProvider.Factory bindsViewModelFactory(ViewModelFactory viewModelFactory);


}
