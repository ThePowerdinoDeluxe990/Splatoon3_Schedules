package com.powerdino.splatoon3_companion.model.salmon_run.resources


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Modes(
    @SerialName("BigRun")
    val bigRun: String,
    @SerialName("Normal")
    val normal: String,
    @SerialName("TeamContest")
    val teamContest: String
)