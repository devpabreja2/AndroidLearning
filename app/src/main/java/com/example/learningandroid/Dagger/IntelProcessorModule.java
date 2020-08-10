package com.example.learningandroid.Dagger;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class IntelProcessorModule {

    private int cores;

    public IntelProcessorModule(int cores) {
        this.cores = cores;
    }

    @Provides
    Processor bindProcessor() {
        return new IntelProcessor(cores);
    }
}
