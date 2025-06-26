package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class RegularSchedules(
    @SerializedName("nodes")
    val nodes: List<NodeX>
)