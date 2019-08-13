package com.example.dagger;

import javax.inject.Inject;

import dagger.Module;

/**
 * now we assume that this class doesn't belongs to us.
 * IN real world example this would mean this class comes from a third party application/library
 * we are using. In this case we cannot use @Inject on the constructor so we will import it via
 * dagger2 @module annotation
 */

@Module
public class Wheels {

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
