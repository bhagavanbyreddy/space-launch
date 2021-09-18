package com.example.apollographqltutorial.di

import com.example.apollographqltutorial.repository.LaunchRepository
import com.example.apollographqltutorial.repository.LaunchRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped


@Module
@InstallIn(ViewModelComponent::class)
abstract class ViewModelModule {

    @Binds
    @ViewModelScoped
    abstract fun bindRepository(repo: LaunchRepositoryImpl): LaunchRepository

}