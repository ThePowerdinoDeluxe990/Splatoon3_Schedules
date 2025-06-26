package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class BankaraMatchSetting(
    @SerializedName("bankaraMode")
    val bankaraMode: String,
    @SerializedName("__isVsSetting")
    val isVsSetting: String,
    @SerializedName("__typename")
    val typename: String,
    @SerializedName("vsRule")
    val vsRule: VsRule,
    @SerializedName("vsStages")
    val vsStages: List<VsStage>
)