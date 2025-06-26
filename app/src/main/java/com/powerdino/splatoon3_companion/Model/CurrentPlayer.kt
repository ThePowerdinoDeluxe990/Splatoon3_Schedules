package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class CurrentPlayer(
    @SerializedName("userIcon")
    val userIcon: UserIcon
)