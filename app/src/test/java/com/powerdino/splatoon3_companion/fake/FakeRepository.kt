package com.powerdino.splatoon3_companion.fake

import com.powerdino.splatoon3_companion.data.SplatoonRepository
import com.powerdino.splatoon3_companion.model.Data
import com.powerdino.splatoon3_companion.model.salmon_run.Salmon
import com.powerdino.splatoon3_companion.model.salmon_run.resources.SalmonResources

class FakeRepository : SplatoonRepository{
    override suspend fun getSplatoonData(): Data {
        return FakeDataSource.getSplatoonData()
    }

    override suspend fun getSalmonResources(): SalmonResources {
       return FakeDataSource.getSalmonResources()
    }

    override suspend fun getSalmonSchedule(): Salmon {
       return FakeDataSource.getSalmonShedules()
    }
}