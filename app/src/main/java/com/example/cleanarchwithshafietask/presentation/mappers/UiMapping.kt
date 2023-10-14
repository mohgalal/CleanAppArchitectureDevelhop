package com.example.cleanarchwithshafietask.presentation.mappers

import com.example.cleanarchwithshafietask.domain.models.MobileDomainModel
import com.example.cleanarchwithshafietask.presentation.MobileUiModel
import com.example.cleanarchwithshafietask.util.Constants
import com.example.cleanarchwithshafietask.util.Mobile

fun MobileDomainModel.toUIModel(): MobileUiModel {
    val displayBrandName = when (this.brandName) {
        Mobile.IPHONE.name -> Constants.IPHONE
        Mobile.SAMSUNG.name -> Constants.SAMSUNG
        else -> Constants.UNKNOWN
    }
    return MobileUiModel(brandName = displayBrandName)
}