package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class LeagueMatchEvent(
    @SerializedName("desc")
    val desc: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("leagueMatchEventId")
    val leagueMatchEventId: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("regulation")
    val regulation: String,
    @SerializedName("regulationUrl")
    val regulationUrl: Any
)