package com.example.dagger;

import android.app.Application;

public class ExampleApp extends Application {
    ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent=DaggerApplicationComponent.create();
    }

    public ApplicationComponent getCarComponent(){
        return applicationComponent;
    }

}
