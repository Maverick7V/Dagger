package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Car  {
    public static final String TAG="carTAG";
    Engine engine;
    Wheels wheels;

    @Inject
    public Car(Engine engine,Wheels wheels){

    }

    public void drive(){
        Log.d(TAG,"car is driving......from field");
    }
}
