package com.example.samplearch.home.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/example/samplearch/home/data/repository/ProductRepository;", "", "productsRemoteDataSource", "Lcom/example/samplearch/home/data/remote/ProductsRemoteDataSource;", "(Lcom/example/samplearch/home/data/remote/ProductsRemoteDataSource;)V", "getProductsList", "", "Lcom/example/samplearch/home/data/model/ProductResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProductRepository {
    private final com.example.samplearch.home.data.remote.ProductsRemoteDataSource productsRemoteDataSource = null;
    
    @javax.inject.Inject
    public ProductRepository(@org.jetbrains.annotations.NotNull
    com.example.samplearch.home.data.remote.ProductsRemoteDataSource productsRemoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getProductsList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.samplearch.home.data.model.ProductResponse>> continuation) {
        return null;
    }
}