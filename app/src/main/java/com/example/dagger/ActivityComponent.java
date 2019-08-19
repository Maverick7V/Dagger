package com.example.dagger;


import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;


@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        ActivityComponent build();

        Builder appComponent(ApplicationComponent applicationComponent);
    }
}
