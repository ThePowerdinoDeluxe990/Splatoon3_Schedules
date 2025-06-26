package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class Node(
    @SerializedName("bankaraMatchSettings")
    val bankaraMatchSettings: List<BankaraMatchSetting>,
    @SerializedName("endTime")
    val endTime: String,
    @SerializedName("festMatchSettings")
    val festMatchSettings: Any,
    @SerializedName("startTime")
    val startTime: String
)