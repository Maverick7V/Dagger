package com.example.dagger;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface ApplicationComponent {
    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);
}
