package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class Weapon(
    @SerializedName("image")
    val image: Image,
    @SerializedName("name")
    val name: String,
    @SerializedName("__splatoon3ink_id")
    val splatoon3inkId: String
)