package com.example.dagger;


import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;


@PerActivity
@Subcomponent( modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();
    void inject(MainActivity mainActivity);

//    @Subcomponent.Builder
//    interface Builder {
//
//        Builder horsePower(  @BindsInstance @Named("horsePower") int horsePower);
//
//
//        Builder engineCapacity(  @BindsInstance @Named("engineCapacity") int engineCapacity);
//
//        ActivityComponent build();
//    }

    @Subcomponent.Factory
    interface Factory{


        ActivityComponent create(
                @BindsInstance @Named("horsePower") int horsePower,
                 @BindsInstance @Named("engineCapacity") int engineCapacity);
    }

}
