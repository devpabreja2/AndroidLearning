package com.example.learningandroid.Dagger;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class BatteryModule {

    @Provides
    static Cells provideCells() {
        return new Cells();
    }

    @Provides
    static Casing provideCasing() {
        Casing casing = new Casing();
        casing.install();
        return casing;
    }

    @Provides
    static Battery provideBattety(Cells cells, Casing casing) {
        return new Battery(cells, casing);
    }
}
