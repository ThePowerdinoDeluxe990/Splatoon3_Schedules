package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("bankaraSchedules")
    val bankaraSchedules: BankaraSchedules,
    @SerializedName("coopGroupingSchedule")
    val coopGroupingSchedule: CoopGroupingSchedule,
    @SerializedName("currentFest")
    val currentFest: Any,
    @SerializedName("currentPlayer")
    val currentPlayer: CurrentPlayer,
    @SerializedName("eventSchedules")
    val eventSchedules: EventSchedules,
    @SerializedName("festSchedules")
    val festSchedules: FestSchedules,
    @SerializedName("regularSchedules")
    val regularSchedules: RegularSchedulesX,
    @SerializedName("vsStages")
    val vsStages: VsStages,
    @SerializedName("xSchedules")
    val xSchedules: XSchedules
)