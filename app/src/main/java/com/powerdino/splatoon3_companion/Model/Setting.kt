package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class Setting(
    @SerializedName("boss")
    val boss: Boss,
    @SerializedName("coopStage")
    val coopStage: CoopStage,
    @SerializedName("__isCoopSetting")
    val isCoopSetting: String,
    @SerializedName("__typename")
    val typename: String,
    @SerializedName("weapons")
    val weapons: List<Weapon>
)