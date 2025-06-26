package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class TimePeriod(
    @SerializedName("endTime")
    val endTime: String,
    @SerializedName("startTime")
    val startTime: String
)