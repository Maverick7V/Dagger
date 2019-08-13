package com.example.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    //making methods as static as the objects are not depended on the class's insantiation
    //also this provides for better performances

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires=new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static  Wheels provideWheels(Rims rims,Tires tires){
        return new Wheels(rims,tires);
    }
}
