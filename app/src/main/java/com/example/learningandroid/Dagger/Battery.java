package com.example.learningandroid.Dagger;

import javax.inject.Inject;

public class Battery {

    //we don't own this class so we can't annotate it with @Inject

    private Cells cells;
    private Casing casing;


    public Battery(Cells cells, Casing casing) {
        this.cells = cells;
        this.casing = casing;
    }
}
