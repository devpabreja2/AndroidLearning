package com.example.learningandroid.Dagger;

import android.util.Log;

import javax.inject.Inject;

public class Laptop {
    private static final String TAG = "Laptop";

    private static Processor processor;
    private Battery battery;

    @Inject
    public Laptop(Processor processor, Battery battery) {
        this.processor = processor;
        this.battery = battery;
    }

    @Inject
    public void enablePower(Power power) {
        power.setListener(this);
    }

    public static void start() {
        processor.start();
        Log.d(TAG, "Starting...");
    }
}
