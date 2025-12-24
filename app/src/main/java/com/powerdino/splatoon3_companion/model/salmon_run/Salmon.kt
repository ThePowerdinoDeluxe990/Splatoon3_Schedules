package com.powerdino.splatoon3_companion.model.salmon_run


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Salmon(
    @SerialName("BigRun")
    val bigRun: List<String>,
    @SerialName("Normal")
    val normal: List<Normal>,
    @SerialName("TeamContest")
    val teamContest: List<String>
)