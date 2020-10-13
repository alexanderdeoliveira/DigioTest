package com.alexander.digiotest.remote

import com.alexander.digiotest.model.Response
import com.alexander.digiotest.service.DigioService

class RemoteDataSourceImpl(private val service: DigioService) : RemoteDataSource {

    override suspend fun getMainData(): Response = service.getMainData()

}