package com.nexti.androidtestexample;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.scopes.ViewModelScoped;

@Module
@InstallIn(ViewModelComponent.class)
public class CalculatorModule {

    @Provides
    @ViewModelScoped
    public CalculatorRepository provideCalculatorRepository() {
        return new CalculatorRepository();
    }
}
