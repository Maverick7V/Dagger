package com.example.dagger;


import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindsPetrolEngine(PetrolEngine engine);

}
