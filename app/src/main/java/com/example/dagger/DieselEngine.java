package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{

    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.d("carTAG","diesel engine started.......");
    }
}
