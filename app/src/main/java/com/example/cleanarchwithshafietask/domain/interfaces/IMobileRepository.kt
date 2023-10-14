package com.example.cleanarchwithshafietask.domain.interfaces

import com.example.cleanarchwithshafietask.domain.models.MobileDomainModel

interface IMobileRepository {
    suspend fun getMobileFromEndPoint(): MobileDomainModel
    suspend fun getMobileFromDateBase():MobileDomainModel
}