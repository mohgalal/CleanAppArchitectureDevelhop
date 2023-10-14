package com.example.cleanarchwithshafietask.data.source.local

import com.example.cleanarchwithshafietask.data.MobileDataModel
import javax.inject.Inject

class LocalDataSource @Inject constructor():ILocalDataSource {
    override fun getLocalMobileDetails() = MobileDataModel("iPhone 11", "i","11/10/2023","1222478")

}