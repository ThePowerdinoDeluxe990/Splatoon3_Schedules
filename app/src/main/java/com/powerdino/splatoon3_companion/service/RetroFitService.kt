package com.powerdino.splatoon3_companion.service
import com.powerdino.splatoon3_companion.model.Data
import com.powerdino.splatoon3_companion.model.salmon_run.Salmon
import com.powerdino.splatoon3_companion.model.salmon_run.resources.SalmonResources
import retrofit2.http.GET

interface RetroFitService{
        @GET("api/v1/three/versus/phases?count=3")
        suspend fun getData(): Data

        @GET("api/v1/three/resources/coop?language=USen")
        suspend fun getSalmonResources(): SalmonResources

        @GET("api/v1/three/coop/phases?count=3")
        suspend fun getSalmonSchedules(): Salmon
}