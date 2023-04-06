package com.example.samplearch.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0018H&R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\f\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\tR,\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/example/samplearch/base/BaseFragment;", "T", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "binding", "getBinding$annotations", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "bindingInflater", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "getBindingInflater", "()Lkotlin/jvm/functions/Function3;", "onCreateView", "Landroid/view/View;", "inflater", "container", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onViewCreated", "view", "setup", "app_release"})
public abstract class BaseFragment<T extends androidx.viewbinding.ViewBinding> extends androidx.fragment.app.Fragment {
    private androidx.viewbinding.ViewBinding _binding;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlin.jvm.functions.Function3<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, T> getBindingInflater();
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Deprecated
    protected static void getBinding$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final T getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract void setup();
    
    @java.lang.Override
    public void onDestroyView() {
    }
}