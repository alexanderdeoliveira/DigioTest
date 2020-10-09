package com.alexander.digiotest.remote

import com.alexander.digiotest.model.Response

interface RemoteDataSource {

    suspend fun getMainData() : Response

}