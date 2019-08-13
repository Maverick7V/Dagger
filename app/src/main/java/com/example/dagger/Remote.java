package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

class Remote {

    private static final String TAG ="carTAG" ;

    @Inject
    public Remote(){

    }
    public void setListener(Car car){
        Log.d(TAG,"REMOTE is now connectioned");
    }
}
