package com.example.learningandroid.Dagger;

import android.util.Log;

import javax.inject.Inject;

public class AmdProcessor implements Processor {
    public static final String TAG = "Laptop";

    @Inject
    public AmdProcessor() {

    }

    @Override
    public void start() {
        Log.d(TAG, "Amd Processor Started");
    }
}
