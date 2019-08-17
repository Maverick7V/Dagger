package com.example.dagger;


import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WheelsModule.class,PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

@Component.Builder
    interface Builder{
    @BindsInstance
    Builder horsePower(@Named("horsePower") int horsePower);

    @BindsInstance
    Builder engineCapacity(@Named("engineCapacity") int engineCapacity);
    CarComponent build();
}
}
