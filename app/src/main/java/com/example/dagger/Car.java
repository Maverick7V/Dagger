package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

                                                                                                                                                                        
@PerActivity
public class Car  {
    public static final String TAG="carTAG";
    private Engine engine;
    private  Wheels wheels;
    private Driver driver;
    @Inject
    public Car(Wheels wheels,Driver driver,Engine engine){
        this.driver=driver;
        this.wheels=wheels;
        this.engine=engine;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.d(TAG,driver+" is driving......from field"+this);
    }
}
