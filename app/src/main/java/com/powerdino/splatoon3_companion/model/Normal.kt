package com.powerdino.splatoon3_companion.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Normal(
    @SerialName("Bankara")
    val bankara: Bankara,
    @SerialName("BankaraOpen")
    val bankaraOpen: BankaraOpen,
    @SerialName("endTime")
    val endTime: String,
    @SerialName("League")
    val league: League,
    @SerialName("phaseId")
    val phaseId: String,
    @SerialName("Regular")
    val regular: Regular,
    @SerialName("startTime")
    val startTime: String,
    @SerialName("X")
    val x: X
)