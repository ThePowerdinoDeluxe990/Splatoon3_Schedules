package com.powerdino.splatoon3_companion.model.salmon_run.resources


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Enemy(
    @SerialName("SakeArtillery")
    val sakeArtillery: String,
    @SerialName("SakeBigMouth")
    val sakeBigMouth: String,
    @SerialName("SakeBigMouthGold")
    val sakeBigMouthGold: String,
    @SerialName("SakeCopter")
    val sakeCopter: String,
    @SerialName("SakeDolphin")
    val sakeDolphin: String,
    @SerialName("SakeFlyBagman")
    val sakeFlyBagman: String,
    @SerialName("SakeJaw")
    val sakeJaw: String,
    @SerialName("SakePillar")
    val sakePillar: String,
    @SerialName("SakeRope")
    val sakeRope: String,
    @SerialName("SakeSaucer")
    val sakeSaucer: String,
    @SerialName("Sakediver")
    val sakediver: String,
    @SerialName("Sakedozer")
    val sakedozer: String,
    @SerialName("SakelienBomber")
    val sakelienBomber: String,
    @SerialName("SakelienCupTwins")
    val sakelienCupTwins: String,
    @SerialName("SakelienGiant")
    val sakelienGiant: String,
    @SerialName("SakelienGolden")
    val sakelienGolden: String,
    @SerialName("SakelienLarge")
    val sakelienLarge: String,
    @SerialName("SakelienShield")
    val sakelienShield: String,
    @SerialName("SakelienSmall")
    val sakelienSmall: String,
    @SerialName("SakelienSnake")
    val sakelienSnake: String,
    @SerialName("SakelienStandard")
    val sakelienStandard: String,
    @SerialName("SakelienTower")
    val sakelienTower: String,
    @SerialName("Sakerocket")
    val sakerocket: String,
    @SerialName("Triple")
    val triple: String
)