package com.ranganayaki.industryprojectstructure.rest

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RetrofitConfigModule {

    @Singleton
    @Provides
    fun retrofit() = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.trello.com/1/")
        .build()

    @Singleton
    @Provides
    fun trelloOrganizationApi(retrofit: Retrofit) = retrofit.create(TrelloOrganizationApi::class.java)
}