package com.powerdino.splatoon3_companion.model.resources_versus


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Rules(
    @SerialName("Area")
    val area: String,
    @SerialName("Clam")
    val clam: String,
    @SerialName("Goal")
    val goal: String,
    @SerialName("Lift")
    val lift: String,
    @SerialName("Paint")
    val paint: String,
    @SerialName("Tricolor")
    val tricolor: String
)