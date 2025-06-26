package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class NodeX(
    @SerializedName("endTime")
    val endTime: String,
    @SerializedName("setting")
    val setting: Setting,
    @SerializedName("__splatoon3ink_king_salmonid_guess")
    val splatoon3inkKingSalmonidGuess: String,
    @SerializedName("startTime")
    val startTime: String
)