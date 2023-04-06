package com.example.samplearch.main.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/samplearch/main/di/MainModule;", "", "()V", "bindMainRepository", "Lcom/example/samplearch/main/domain/IMainRepository;", "mainRepository", "Lcom/example/samplearch/main/data/MainRepository;", "bindMainRepository$app_devDebug", "app_devDebug"})
@dagger.Module
public abstract class MainModule {
    
    public MainModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.example.samplearch.main.domain.IMainRepository bindMainRepository$app_devDebug(@org.jetbrains.annotations.NotNull
    com.example.samplearch.main.data.MainRepository mainRepository);
}