package com.powerdino.splatoon3_companion.service
import com.powerdino.splatoon3_companion.model.Data
import retrofit2.http.GET

interface RetroFitService{
        @GET("api/v1/three/versus/phases?count=2")
        suspend fun getData(): Data
}