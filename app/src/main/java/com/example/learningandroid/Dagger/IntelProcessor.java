package com.example.learningandroid.Dagger;

import android.util.Log;

import javax.inject.Inject;

public class IntelProcessor implements Processor {
    public static final String TAG = "Laptop";

    private int cores;


    public IntelProcessor(int cores) {
        this.cores = cores;
    }

    @Override
    public void start() {
        Log.d(TAG, "Intel Processor Started. Cores: " + cores);
    }
}
