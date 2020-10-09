package com.alexander.digiotest.di

import com.alexander.digiotest.repository.Repository
import com.alexander.digiotest.repository.RepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<Repository> { RepositoryImpl(get()) }
}