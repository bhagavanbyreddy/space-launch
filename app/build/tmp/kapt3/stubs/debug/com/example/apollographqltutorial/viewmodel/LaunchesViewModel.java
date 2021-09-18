package com.example.apollographqltutorial.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0019R-\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR-\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0010\u0010\u000bR#\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u00070\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/apollographqltutorial/viewmodel/LaunchesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/apollographqltutorial/repository/LaunchRepository;", "(Lcom/example/apollographqltutorial/repository/LaunchRepository;)V", "_launchData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/apollographqltutorial/view/state/ViewState;", "Lcom/apollographql/apollo/api/Response;", "Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Data;", "get_launchData", "()Landroidx/lifecycle/MutableLiveData;", "_launchData$delegate", "Lkotlin/Lazy;", "_launchesList", "Lcom/example/apollographqltutorial/SpaceLaunchesListQuery$Data;", "get_launchesList", "_launchesList$delegate", "launchData", "Landroidx/lifecycle/LiveData;", "getLaunchData", "()Landroidx/lifecycle/LiveData;", "launchesList", "getLaunchesList", "queryLaunchDetails", "Lkotlinx/coroutines/Job;", "id", "", "querySpaceXLaunchesList", "app_debug"})
public final class LaunchesViewModel extends androidx.lifecycle.ViewModel {
    private final kotlin.Lazy _launchesList$delegate = null;
    private final kotlin.Lazy _launchData$delegate = null;
    private final com.example.apollographqltutorial.repository.LaunchRepository repository = null;
    
    private final androidx.lifecycle.MutableLiveData<com.example.apollographqltutorial.view.state.ViewState<com.apollographql.apollo.api.Response<com.example.apollographqltutorial.SpaceLaunchesListQuery.Data>>> get_launchesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.apollographqltutorial.view.state.ViewState<com.apollographql.apollo.api.Response<com.example.apollographqltutorial.SpaceLaunchesListQuery.Data>>> getLaunchesList() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<com.example.apollographqltutorial.view.state.ViewState<com.apollographql.apollo.api.Response<com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data>>> get_launchData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.apollographqltutorial.view.state.ViewState<com.apollographql.apollo.api.Response<com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data>>> getLaunchData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job querySpaceXLaunchesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job queryLaunchDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @javax.inject.Inject()
    public LaunchesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.apollographqltutorial.repository.LaunchRepository repository) {
        super();
    }
}