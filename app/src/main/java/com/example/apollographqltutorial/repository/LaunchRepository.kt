package com.example.apollographqltutorial.repository

import com.apollographql.apollo.api.Response
import com.example.apollographqltutorial.SpaceLaunchDetailsQuery
import com.example.apollographqltutorial.SpaceLaunchesListQuery


interface LaunchRepository {

    suspend fun queryLaunchesList(): Response<SpaceLaunchesListQuery.Data>

    suspend fun queryLaunchDetails(id: String): Response<SpaceLaunchDetailsQuery.Data>

}