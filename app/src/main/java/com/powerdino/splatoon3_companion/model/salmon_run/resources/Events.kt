package com.powerdino.splatoon3_companion.model.salmon_run.resources


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Events(
    @SerialName("Dozer")
    val dozer: String,
    @SerialName("Fog")
    val fog: String,
    @SerialName("Geyser")
    val geyser: String,
    @SerialName("Hakobiya")
    val hakobiya: String,
    @SerialName("Missile")
    val missile: String,
    @SerialName("Relay")
    val relay: String,
    @SerialName("Rush")
    val rush: String,
    @SerialName("Tamaire")
    val tamaire: String
)