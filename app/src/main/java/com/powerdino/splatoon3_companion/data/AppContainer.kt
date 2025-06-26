package com.powerdino.splatoon3_companion.data

import com.powerdino.splatoon3_companion.service.RetroFitService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface AppContainer {
    val splatoonRepository:SplatoonRepository
}

class DefaultAppContainer:AppContainer{
    private val baseUrl = "https://splatoon3.ink/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(baseUrl)
        .build()

    private val retroFitService:RetroFitService by lazy{
        retrofit.create(RetroFitService::class.java)
    }

    override val splatoonRepository: SplatoonRepository by lazy {
        NetworkSplatoonRepository(retroFitService)
    }
}