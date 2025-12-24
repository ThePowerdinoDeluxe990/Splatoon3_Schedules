package com.powerdino.splatoon3_companion.model.salmon_run.resources


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Tides(
    @SerialName("High")
    val high: String,
    @SerialName("Low")
    val low: String,
    @SerialName("Mid")
    val mid: String
)