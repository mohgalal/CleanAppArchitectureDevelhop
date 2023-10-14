package com.example.cleanarchwithshafietask.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.cleanarchwithshafietask.R
import com.example.cleanarchwithshafietask.data.MobileRepository
import com.example.cleanarchwithshafietask.data.source.local.LocalDataSource
import com.example.cleanarchwithshafietask.data.source.remote.RemoteDataSource
import com.example.cleanarchwithshafietask.domain.usecases.GetMobileModel
import com.example.cleanarchwithshafietask.presentation.viewmodel.MobileViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MobileViewModel
    lateinit var mobileTv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mobileTv = findViewById(R.id.mobile_tv)

        viewModel = ViewModelProvider(this)[MobileViewModel::class.java]

        lifecycleScope.launch {
            viewModel.stateFlow.collect{
                mobileTv.text = it
            }
        }

    }
}