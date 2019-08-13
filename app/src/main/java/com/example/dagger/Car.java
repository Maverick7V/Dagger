package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Car  {
    public static final String TAG="carTAG";
    @Inject Engine engine;
    private  Wheels wheels;

    @Inject
    public Car(Wheels wheels){
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.d(TAG,"car is driving......from field");
    }
}
