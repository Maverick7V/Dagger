package com.example.dagger;


import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    @Provides
   static  Driver provideDriver(){
        return new Driver();
    }
}
