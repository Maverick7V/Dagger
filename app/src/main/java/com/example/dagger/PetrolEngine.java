package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        Log.d("carTAG","Petrol engine Started...........");
    }
}
