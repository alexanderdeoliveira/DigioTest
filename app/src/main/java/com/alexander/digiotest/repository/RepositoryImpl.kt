package com.alexander.digiotest.repository

import com.alexander.digiotest.remote.RemoteDataSource
import com.alexander.digiotest.model.Response

class RepositoryImpl(private val remoteDataSource: RemoteDataSource) : Repository {

    override suspend fun getMainData(): Response = remoteDataSource.getMainData()
}