package com.example.cleanarchwithshafietask.data

import android.util.Log
import com.example.cleanarchwithshafietask.data.mappers.toDomainModel
import com.example.cleanarchwithshafietask.data.source.local.ILocalDataSource
import com.example.cleanarchwithshafietask.data.source.local.LocalDataSource
import com.example.cleanarchwithshafietask.data.source.remote.IRemoteDataSource
import com.example.cleanarchwithshafietask.data.source.remote.RemoteDataSource
import com.example.cleanarchwithshafietask.domain.interfaces.IMobileRepository
import com.example.cleanarchwithshafietask.domain.models.MobileDomainModel

class MobileRepository(
    private val remoteDataSource: IRemoteDataSource = RemoteDataSource(),
    private val localDatatSource: ILocalDataSource = LocalDataSource()
) : IMobileRepository {

    override suspend fun getMobileFromEndPoint(): MobileDomainModel {
        Log.d("TAGGG", "getMobileFromEndPoint: ${ remoteDataSource.getRemoteMobileDetails().brandName}")
        val dataModel = remoteDataSource.getRemoteMobileDetails()
        return dataModel.toDomainModel()
    }

    override suspend fun getMobileFromDateBase(): MobileDomainModel =
        localDatatSource.getLocalMobileDetails().toDomainModel()
}