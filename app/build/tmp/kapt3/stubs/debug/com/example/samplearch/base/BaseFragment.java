package com.example.samplearch.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0004J\b\u0010\u0018\u001a\u00020\u0015H\u0004J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u001a\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J.\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010\'\u001a\u00020\u000f2\b\b\u0002\u0010(\u001a\u00020\u0013H\u0004J\b\u0010)\u001a\u00020\u0015H&R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\f\u0012\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\nR,\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/example/samplearch/base/BaseFragment;", "T", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "Lcom/example/samplearch/base/LoadingBinding;", "()V", "_binding", "binding", "getBinding$annotations", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "bindingInflater", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "getBindingInflater", "()Lkotlin/jvm/functions/Function3;", "emptyNavigationIcon", "", "navigateTo", "", "navDirections", "Landroidx/navigation/NavDirections;", "navigateUp", "onCreateView", "Landroid/view/View;", "inflater", "container", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "setToolbar", "mToolbar", "Landroidx/appcompat/widget/Toolbar;", "title", "", "setHomeAsUpEnabled", "navigationIconDrawable", "setup", "app_debug"})
public abstract class BaseFragment<T extends androidx.viewbinding.ViewBinding> extends androidx.fragment.app.Fragment implements com.example.samplearch.base.LoadingBinding {
    private androidx.viewbinding.ViewBinding _binding;
    private final int emptyNavigationIcon = -1;
    
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
    
    protected final void setToolbar(@org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.Toolbar mToolbar, @org.jetbrains.annotations.NotNull
    java.lang.String title, boolean setHomeAsUpEnabled, int navigationIconDrawable) {
    }
    
    protected final void navigateTo(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavDirections navDirections) {
    }
    
    protected final void navigateUp() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    public void bindLoading(@org.jetbrains.annotations.NotNull
    com.example.samplearch.model.LoadingTypes loadingTypes, @org.jetbrains.annotations.Nullable
    com.example.samplearch.databinding.LayoutProgressMainBinding layoutProgressMain, @org.jetbrains.annotations.Nullable
    com.example.samplearch.databinding.LayoutProgressHoverBinding layoutHover, @org.jetbrains.annotations.Nullable
    com.example.samplearch.databinding.LayoutProgressMainBinding layoutProgressPaging, @org.jetbrains.annotations.Nullable
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefresh) {
    }
    
    public void bindLoadingHover(boolean isLoading, @org.jetbrains.annotations.Nullable
    com.example.samplearch.databinding.LayoutProgressHoverBinding layoutProgress) {
    }
    
    public void bindLoadingMain(boolean isLoading, @org.jetbrains.annotations.Nullable
    com.example.samplearch.databinding.LayoutProgressMainBinding layoutProgress) {
    }
    
    public void bindLoadingPaging(boolean isLoading, @org.jetbrains.annotations.Nullable
    com.example.samplearch.databinding.LayoutProgressMainBinding layoutProgress) {
    }
    
    public void bindLoadingRefresh(boolean isLoading, @org.jetbrains.annotations.Nullable
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout layoutProgress) {
    }
}