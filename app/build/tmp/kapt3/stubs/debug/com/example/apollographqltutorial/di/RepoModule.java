package com.example.apollographqltutorial.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/example/apollographqltutorial/di/RepoModule;", "", "()V", "provideWebService", "Lcom/example/apollographqltutorial/networking/ApolloClientBuilder;", "app_debug"})
@dagger.Module()
public final class RepoModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.apollographqltutorial.di.RepoModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.apollographqltutorial.networking.ApolloClientBuilder provideWebService() {
        return null;
    }
    
    private RepoModule() {
        super();
    }
}