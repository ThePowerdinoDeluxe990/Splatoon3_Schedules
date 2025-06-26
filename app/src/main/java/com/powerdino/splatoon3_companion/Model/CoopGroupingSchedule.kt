package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class CoopGroupingSchedule(
    @SerializedName("bannerImage")
    val bannerImage: Any,
    @SerializedName("bigRunSchedules")
    val bigRunSchedules: BigRunSchedules,
    @SerializedName("regularSchedules")
    val regularSchedules: RegularSchedules,
    @SerializedName("teamContestSchedules")
    val teamContestSchedules: TeamContestSchedules
)