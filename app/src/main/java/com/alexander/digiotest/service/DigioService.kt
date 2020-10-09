package com.alexander.digiotest.service

import com.alexander.digiotest.model.Response
import retrofit2.http.GET

interface DigioService {

    @GET("sandbox/products")
    suspend fun getMainData(): Response
}