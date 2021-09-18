package com.example.apollographqltutorial.repository

import com.apollographql.apollo.api.Response
import com.apollographql.apollo.coroutines.await
import com.example.apollographqltutorial.SpaceLaunchDetailsQuery
import com.example.apollographqltutorial.SpaceLaunchesListQuery

import com.example.apollographqltutorial.networking.ApolloClientBuilder
import javax.inject.Inject

class LaunchRepositoryImpl
    @Inject
    constructor(
    private val webService: ApolloClientBuilder
) : LaunchRepository {

    override suspend fun queryLaunchesList(): Response<SpaceLaunchesListQuery.Data> {
        return webService.getApolloClient().query(SpaceLaunchesListQuery()).await()
    }

    override suspend fun queryLaunchDetails(id: String): Response<SpaceLaunchDetailsQuery.Data> {
        return webService.getApolloClient().query(SpaceLaunchDetailsQuery(id)).await()
    }
}