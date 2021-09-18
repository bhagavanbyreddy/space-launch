package com.example.apollographqltutorial.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.exception.ApolloException
import com.example.apollographqltutorial.SpaceLaunchDetailsQuery
import com.example.apollographqltutorial.SpaceLaunchesListQuery
import com.example.apollographqltutorial.repository.LaunchRepository
import com.example.apollographqltutorial.view.state.ViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import javax.inject.Inject


@ExperimentalCoroutinesApi
@HiltViewModel
class LaunchesViewModel @Inject constructor(
    private val repository: LaunchRepository,
) : ViewModel() {

    // launches data
    private val _launchesList by lazy {
        MutableLiveData<ViewState<Response<SpaceLaunchesListQuery.Data>>>()
    }
    val launchesList: LiveData<ViewState<Response<SpaceLaunchesListQuery.Data>>>
        get() = _launchesList

    // launch details data
    private val _launchData by lazy {
        MutableLiveData<ViewState<Response<SpaceLaunchDetailsQuery.Data>>>()
    }
    val launchData: LiveData<ViewState<Response<SpaceLaunchDetailsQuery.Data>>>
        get() = _launchData


    fun querySpaceXLaunchesList() = viewModelScope.launch {
        _launchesList.postValue(ViewState.Loading())
        try {
            val response = repository.queryLaunchesList()
            _launchesList.postValue(ViewState.Success(response))
        } catch (e: ApolloException) {
            Log.d("ApolloException", "Failure", e)
            _launchesList.postValue(ViewState.Error("Error fetching characters"))
        }
    }

    fun queryLaunchDetails(id: String) = viewModelScope.launch {
        _launchData.postValue(ViewState.Loading())
        try {
            val response = repository.queryLaunchDetails(id)
            _launchData.postValue(ViewState.Success(response))
        } catch (ae: ApolloException) {
            Log.d("ApolloException", "Failure", ae)
            _launchData.postValue(ViewState.Error("Error fetching characters"))
        }
    }
}