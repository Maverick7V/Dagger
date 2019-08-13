package com.example.dagger;


import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

    @Provides
    abstract Engine ProvidePetrolEngine(PetrolEngine engine);

}
