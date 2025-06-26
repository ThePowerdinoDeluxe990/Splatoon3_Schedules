package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class VsRule(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("rule")
    val rule: String
)