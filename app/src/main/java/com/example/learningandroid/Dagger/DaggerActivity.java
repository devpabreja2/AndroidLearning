package com.example.learningandroid.Dagger;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learningandroid.R;

import javax.inject.Inject;

public class DaggerActivity extends AppCompatActivity {
    @Inject Laptop laptop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
//        LaptopComponent component = DaggerLaptopComponent.create();
        LaptopComponent component = DaggerLaptopComponent.builder()
                .intelProcessorModule(new IntelProcessorModule(8))
                .build();
        component.inject(this);
        Laptop.start();
    }
}
