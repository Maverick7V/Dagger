package com.example.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Car car1,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component=DaggerActivityComponent.builder()
                .engineCapacity(5000)
                .horsePower(200)
                .appComponent(((ExampleApp)getApplication()).getCarComponent())
                .build();

        component.inject(this);

        car1.drive();
        car2.drive();
    }
}
