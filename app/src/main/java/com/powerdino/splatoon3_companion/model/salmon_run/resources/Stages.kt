package com.powerdino.splatoon3_companion.model.salmon_run.resources


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Stages(
    @SerialName("number")
    val number: String,
    @SerialName("stageName")
    val stageName: String,
)