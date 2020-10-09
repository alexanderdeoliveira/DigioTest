package com.alexander.digiotest.di

import com.alexander.digiotest.remote.RemoteDataSource
import com.alexander.digiotest.remote.RemoteDataSourceImpl
import org.koin.dsl.module

val dataSourceModule = module {
    single<RemoteDataSource> { RemoteDataSourceImpl(get()) }
}