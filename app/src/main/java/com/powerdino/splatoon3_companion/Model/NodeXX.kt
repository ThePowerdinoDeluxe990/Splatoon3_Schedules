package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class NodeXX(
    @SerializedName("leagueMatchSetting")
    val leagueMatchSetting: LeagueMatchSetting,
    @SerializedName("timePeriods")
    val timePeriods: List<TimePeriod>
)