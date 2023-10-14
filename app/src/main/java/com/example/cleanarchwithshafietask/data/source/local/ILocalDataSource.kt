package com.example.cleanarchwithshafietask.data.source.local

import com.example.cleanarchwithshafietask.data.MobileDataModel

interface ILocalDataSource {
    fun getLocalMobileDetails():MobileDataModel
}