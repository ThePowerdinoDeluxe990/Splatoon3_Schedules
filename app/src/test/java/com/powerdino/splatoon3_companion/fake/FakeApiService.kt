package com.powerdino.splatoon3_companion.fake

import com.powerdino.splatoon3_companion.model.Data
import com.powerdino.splatoon3_companion.model.salmon_run.Salmon
import com.powerdino.splatoon3_companion.model.salmon_run.resources.SalmonResources
import com.powerdino.splatoon3_companion.service.RetroFitService

class FakeApiService : RetroFitService {
    override suspend fun getData(): Data {
        return FakeDataSource.getSplatoonData()
    }

    override suspend fun getSalmonResources(): SalmonResources {

    }

    override suspend fun getSalmonSchedules(): Salmon {

    }
}