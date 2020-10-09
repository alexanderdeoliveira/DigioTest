package com.alexander.digiotest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.alexander.digiotest.model.Response
import com.alexander.digiotest.repository.Repository
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val repository: Repository) : ViewModel() {

    val response : LiveData<Response> = liveData(Dispatchers.IO) {
        isLoading.postValue(true)
        emit(repository.getMainData())
        isLoading.postValue(false)
    }

    val isLoading = MutableLiveData<Boolean>()

}