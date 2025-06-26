package com.powerdino.splatoon3_companion.data

import com.powerdino.splatoon3_companion.Model.Data
import com.powerdino.splatoon3_companion.service.RetroFitService

interface SplatoonRepository {
    suspend fun getSplatoonData(): Data
}

class NetworkSplatoonRepository(
    private val splatoonApiService:RetroFitService
): SplatoonRepository{
    override suspend fun getSplatoonData(): Data = splatoonApiService.getData()
}