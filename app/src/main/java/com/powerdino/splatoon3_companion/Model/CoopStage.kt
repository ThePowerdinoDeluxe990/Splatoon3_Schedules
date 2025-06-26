package com.powerdino.splatoon3_companion.Model


import com.google.gson.annotations.SerializedName

data class CoopStage(
    @SerializedName("id")
    val id: String,
    @SerializedName("image")
    val image: Image,
    @SerializedName("name")
    val name: String,
    @SerializedName("thumbnailImage")
    val thumbnailImage: ThumbnailImage
)