package com.powerdino.splatoon3_companion.fake

import com.powerdino.splatoon3_companion.model.Data
import com.powerdino.splatoon3_companion.service.RetroFitService

class FakeApiService : RetroFitService {
    override suspend fun getData(): Data {
        return FakeDataSource.getSplatoonData()
    }
}