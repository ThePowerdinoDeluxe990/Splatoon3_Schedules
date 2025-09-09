package com.powerdino.splatoon3_companion

import com.powerdino.splatoon3_companion.data.NetworkSplatoonRepository
import com.powerdino.splatoon3_companion.fake.FakeApiService
import com.powerdino.splatoon3_companion.fake.FakeDataSource
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test

class NetworkSplatoonTest {

    @Test
    fun networkSplatoonTest_getInfo_verify()=
        runTest {
            val repository = NetworkSplatoonRepository(
              splatoonApiService = FakeApiService()
            )
            assertEquals(
                FakeDataSource.getSplatoonData(),
                repository.getSplatoonData()
            )
        }
}