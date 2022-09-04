package com.smitcoderx.talky.di

import android.app.Application
import com.smitcoderx.talky.UI.Login.LoginRepositoryImpl
import com.smitcoderx.talky.domain.LoginRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLoginRepository(app: Application): LoginRepository {
        return LoginRepositoryImpl(app)
    }

}