package com.example.cleanarchwithshafietask.data.mappers

import com.example.cleanarchwithshafietask.data.MobileDataModel
import com.example.cleanarchwithshafietask.domain.models.MobileDomainModel

fun MobileDataModel.toDomainModel(): MobileDomainModel {
    return MobileDomainModel(
        name = this.name,
        brandName = this.brandName,
        date = this.date,
        code = this.code,
        id = 0,
        otherClients = null,
    )
}