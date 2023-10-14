package com.example.cleanarchwithshafietask.data.source.remote

import com.example.cleanarchwithshafietask.data.MobileDataModel
import javax.inject.Inject

class RemoteDataSource @Inject constructor():IRemoteDataSource {
    override fun getRemoteMobileDetails() = MobileDataModel("iPhone 11", "i","11/10/2023","1222478")
}