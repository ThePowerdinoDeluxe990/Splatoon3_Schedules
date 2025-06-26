package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class NodeXXXXX(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("originalImage")
    val originalImage: OriginalImage,
    @SerializedName("stats")
    val stats: Any,
    @SerializedName("vsStageId")
    val vsStageId: Int
)