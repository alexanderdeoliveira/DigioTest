package com.alexander.digiotest

import androidx.lifecycle.*
import com.alexander.digiotest.model.Response
import com.alexander.digiotest.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(val repository: Repository) : ViewModel() {

    val response: MutableLiveData<Response> by lazy {
        MutableLiveData<Response>()
    }

    val isLoading = MutableLiveData<Boolean>()

    fun getMainData() {
        viewModelScope.launch {
            isLoading.postValue(true)
            response.postValue(repository.getMainData())
            isLoading.postValue(false)
        }
    }

    fun getResponse(): LiveData<Response> {
        return response
    }
}