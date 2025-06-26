package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class EventSchedules(
    @SerializedName("nodes")
    val nodes: List<NodeXX>
)