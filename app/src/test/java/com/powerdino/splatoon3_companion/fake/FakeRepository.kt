package com.powerdino.splatoon3_companion.fake

import com.powerdino.splatoon3_companion.data.SplatoonRepository
import com.powerdino.splatoon3_companion.model.Data

class FakeRepository : SplatoonRepository{
    override suspend fun getSplatoonData(): Data {
        return FakeDataSource.getSplatoonData()
    }
}