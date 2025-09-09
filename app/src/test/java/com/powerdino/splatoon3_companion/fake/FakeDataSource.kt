package com.powerdino.splatoon3_companion.fake

import com.powerdino.splatoon3_companion.model.Bankara
import com.powerdino.splatoon3_companion.model.BankaraOpen
import com.powerdino.splatoon3_companion.model.Data
import com.powerdino.splatoon3_companion.model.Fest
import com.powerdino.splatoon3_companion.model.League
import com.powerdino.splatoon3_companion.model.Normal
import com.powerdino.splatoon3_companion.model.Regular
import com.powerdino.splatoon3_companion.model.X

object FakeDataSource {
    fun getSplatoonData(): Data{
        return Data(
            normal = listOf(
                Normal(
                    bankara = Bankara(
                        rule = "Area",
                        stages = listOf(
                            12, 14, 1, 5,
                        ),
                    ),
                    bankaraOpen = BankaraOpen(
                        rule = "Area",
                        stages = listOf(
                            12, 3, 4,
                        ),
                    ),
                    endTime = "endTime",
                    startTime = "startTime",
                    league = League(
                        eventId = "1",
                        eventType = "especial",
                        rule = "test",
                        stages = listOf(),
                    ),
                    regular = Regular(
                        rule = "paint",
                        stages = listOf(
                            12,
                            10,
                            13,
                        ),
                    ),
                    phaseId = "test",
                    x = X(
                        rule = "test",
                        stages = listOf(
                            12, 1, 3,
                        ),
                    ),
                ),
            ),
            fest = Fest
        )
    }
}