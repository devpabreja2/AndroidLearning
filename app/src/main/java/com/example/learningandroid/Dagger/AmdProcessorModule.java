package com.example.learningandroid.Dagger;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class AmdProcessorModule {

    @Binds
    abstract Processor bindProcessor(AmdProcessor processor);
}
