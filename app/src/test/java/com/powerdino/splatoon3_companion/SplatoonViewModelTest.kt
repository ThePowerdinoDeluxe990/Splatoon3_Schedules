package com.powerdino.splatoon3_companion

import com.powerdino.splatoon3_companion.fake.FakeDataSource
import com.powerdino.splatoon3_companion.fake.FakeRepository
import com.powerdino.splatoon3_companion.rules.TestDispatcherRule
import com.powerdino.splatoon3_companion.ui.viewModels.NetworkState
import com.powerdino.splatoon3_companion.ui.viewModels.SplatoonViewModel
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test

class SplatoonViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun splatoonViewModel_getInfo_verifyIfSuccess()=
        runTest {
            val splatoonViewModel = SplatoonViewModel(
                FakeRepository()
            )


            assertEquals(
                NetworkState.Success(
                    FakeDataSource.getSplatoonData(),
                    FakeDataSource.getSalmonResources(),
                    FakeDataSource.getSalmonShedules()
                ),
                splatoonViewModel.splatoonNetworkState
            )
        }
}