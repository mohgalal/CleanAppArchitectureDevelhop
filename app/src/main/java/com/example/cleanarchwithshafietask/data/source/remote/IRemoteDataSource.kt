package com.example.cleanarchwithshafietask.data.source.remote

import com.example.cleanarchwithshafietask.data.MobileDataModel

interface IRemoteDataSource {
    fun getRemoteMobileDetails(): MobileDataModel

}