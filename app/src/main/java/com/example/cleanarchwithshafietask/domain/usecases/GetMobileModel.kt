package com.example.cleanarchwithshafietask.domain.usecases

import android.util.Log
import com.example.cleanarchwithshafietask.domain.interfaces.IMobileRepository
import com.example.cleanarchwithshafietask.domain.models.MobileDomainModel
import javax.inject.Inject

class GetMobileModel @Inject constructor(private val repository: IMobileRepository) {
    suspend operator fun invoke(): MobileDomainModel {
        Log.d("TAGGG", "invoke: ${repository.getMobileFromEndPoint().brandName}")
        return repository.getMobileFromEndPoint()
    }
}