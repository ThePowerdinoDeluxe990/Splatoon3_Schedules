package com.powerdino.splatoon3_companion.model.salmon_run


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RewardGear(
    @SerialName("id")
    val id: Int,
    @SerialName("kind")
    val kind: String,
    @SerialName("rewardId")
    val rewardId: String
)