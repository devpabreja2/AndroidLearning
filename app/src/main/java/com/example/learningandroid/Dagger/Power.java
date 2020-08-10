package com.example.learningandroid.Dagger;

import android.util.Log;

import javax.inject.Inject;

public class Power {

    private static final String TAG = "Laptop";

    @Inject
    public Power() {

    }

    public void setListener(Laptop laptop) {
        Log.d(TAG, "Powering On");
    }
}
