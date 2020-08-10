package com.example.learningandroid.Dagger;

import dagger.Component;

@Component(modules = {BatteryModule.class, IntelProcessorModule.class})
public interface LaptopComponent {

    Laptop getLaptop();

    void inject(DaggerActivity daggerActivity);
}
