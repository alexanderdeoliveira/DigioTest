package com.alexander.digiotest.ui

import android.os.Bundle
import com.alexander.digiotest.BaseActivity
import com.alexander.digiotest.MainViewModel
import com.alexander.digiotest.R
import com.alexander.digiotest.databinding.ActivityMainBinding
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class MainActivity : BaseActivity() {

    private val binding: ActivityMainBinding by binding(R.layout.activity_main)
    private val viewModel: MainViewModel by viewModel { parametersOf() }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.apply {
            lifecycleOwner = this@MainActivity
            viewModel = this@MainActivity.viewModel
        }
    }
}