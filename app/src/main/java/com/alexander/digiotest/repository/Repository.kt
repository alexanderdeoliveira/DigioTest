package com.alexander.digiotest.repository

import com.alexander.digiotest.model.Response

interface Repository {
    suspend fun getMainData() : Response
}