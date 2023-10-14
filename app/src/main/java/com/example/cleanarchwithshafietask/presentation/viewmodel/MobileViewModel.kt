package com.example.cleanarchwithshafietask.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.cleanarchwithshafietask.domain.usecases.GetMobileModel
import com.example.cleanarchwithshafietask.presentation.mappers.toUIModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MobileViewModel @Inject constructor(private val getMobileModel: GetMobileModel) : ViewModel() {

    private var _stateFlow = MutableStateFlow("")
    val stateFlow = _stateFlow.asStateFlow()

    init {
        getMobileData()
    }

    private fun getMobileData(){

        CoroutineScope(Dispatchers.IO).launch {
            //_stateFlow.emit(MobileMapper.mapToLetter(getMobileModel.invoke()))
            Log.d("TAGGG", "getMobileData: ${getMobileModel.invoke().toUIModel().brandName}")
            _stateFlow.emit(getMobileModel.invoke().toUIModel().brandName)

            Log.d("TAG", "getMobileData: ${_stateFlow.value}")
        }
    }

}