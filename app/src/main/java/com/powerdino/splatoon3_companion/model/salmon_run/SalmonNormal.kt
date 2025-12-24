package com.powerdino.splatoon3_companion.model.salmon_run


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SalmonNormal(
    @SerialName("bigBoss")
    val bigBoss: String,
    @SerialName("endTime")
    val endTime: String,
    @SerialName("phaseId")
    val phaseId: String,
    @SerialName("rareWeapons")
    val rareWeapons: List<String>,
    @SerialName("rewardGear")
    val rewardGear: RewardGear,
    @SerialName("stage")
    val stage: Int,
    @SerialName("startTime")
    val startTime: String,
    @SerialName("weapons")
    val weapons: List<Int>
)