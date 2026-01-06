package com.powerdino.splatoon3_companion.model.resources_versus


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Modes(
    @SerialName("Bankara")
    val bankara: String,
    @SerialName("BankaraOpen")
    val bankaraOpen: String,
    @SerialName("FestChallenge")
    val festChallenge: String,
    @SerialName("FestRegular")
    val festRegular: String,
    @SerialName("FestTriColor")
    val festTriColor: String,
    @SerialName("League")
    val league: String,
    @SerialName("Regular")
    val regular: String,
    @SerialName("X")
    val x: String
)