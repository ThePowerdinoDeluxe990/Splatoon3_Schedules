package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class NodeXXXX(
    @SerializedName("endTime")
    val endTime: String,
    @SerializedName("festMatchSettings")
    val festMatchSettings: Any,
    @SerializedName("regularMatchSetting")
    val regularMatchSetting: RegularMatchSetting,
    @SerializedName("startTime")
    val startTime: String
)