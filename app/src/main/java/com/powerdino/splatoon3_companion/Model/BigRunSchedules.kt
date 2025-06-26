package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class BigRunSchedules(
    @SerializedName("nodes")
    val nodes: List<Any>
)