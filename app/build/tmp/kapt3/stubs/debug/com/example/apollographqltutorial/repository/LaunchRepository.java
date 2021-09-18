package com.example.apollographqltutorial.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/apollographqltutorial/repository/LaunchRepository;", "", "queryLaunchDetails", "Lcom/apollographql/apollo/api/Response;", "Lcom/example/apollographqltutorial/SpaceLaunchDetailsQuery$Data;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryLaunchesList", "Lcom/example/apollographqltutorial/SpaceLaunchesListQuery$Data;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface LaunchRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryLaunchesList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.Response<com.example.apollographqltutorial.SpaceLaunchesListQuery.Data>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object queryLaunchDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.Response<com.example.apollographqltutorial.SpaceLaunchDetailsQuery.Data>> p1);
}