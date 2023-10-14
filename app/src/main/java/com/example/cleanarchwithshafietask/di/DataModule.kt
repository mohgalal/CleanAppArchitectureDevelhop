package com.example.cleanarchwithshafietask.di

import com.example.cleanarchwithshafietask.data.MobileRepository
import com.example.cleanarchwithshafietask.data.source.local.ILocalDataSource
import com.example.cleanarchwithshafietask.data.source.local.LocalDataSource
import com.example.cleanarchwithshafietask.data.source.remote.IRemoteDataSource
import com.example.cleanarchwithshafietask.data.source.remote.RemoteDataSource
import com.example.cleanarchwithshafietask.domain.interfaces.IMobileRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideLocalDataSource(): ILocalDataSource {
        return LocalDataSource()
    }
    @Provides
    @Singleton
    fun provideRemoteDataSource(): IRemoteDataSource {
        return RemoteDataSource()
    }

    @Singleton
    @Provides
    fun provideMobileRepository(
        remoteDataSource: IRemoteDataSource,
        localDataSource: ILocalDataSource
    ): IMobileRepository {
        return MobileRepository(remoteDataSource, localDataSource)
    }

}