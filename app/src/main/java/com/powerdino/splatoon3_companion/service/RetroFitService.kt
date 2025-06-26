package com.powerdino.splatoon3_companion.service
import com.powerdino.splatoon3_companion.Model.Data
import retrofit2.http.GET

interface RetroFitService{
        @GET("data/schedules.json")
        suspend fun getData(): Data
}