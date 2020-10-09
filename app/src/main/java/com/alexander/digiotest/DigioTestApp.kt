package com.alexander.digiotest

import android.app.Application
import com.alexander.digiotest.di.dataSourceModule
import com.alexander.digiotest.di.networkModule
import com.alexander.digiotest.di.repositoryModule
import com.alexander.digiotest.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DigioTestApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@DigioTestApp)
            modules(dataSourceModule)
            modules(repositoryModule)
            modules(viewModelModule)
            modules(networkModule)
        }
    }
}