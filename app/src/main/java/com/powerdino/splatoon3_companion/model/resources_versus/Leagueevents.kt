package com.powerdino.splatoon3_companion.model.resources_versus


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Leagueevents(
    @SerialName("CompetitionRehearsalsAU")
    val competitionRehearsalsAU: CompetitionRehearsalsAU,
    @SerialName("CompetitionRehearsalsEU")
    val competitionRehearsalsEU: CompetitionRehearsalsEU,
    @SerialName("CompetitionRehearsalsJP")
    val competitionRehearsalsJP: CompetitionRehearsalsJP,
    @SerialName("CompetitionRehearsalsUS")
    val competitionRehearsalsUS: CompetitionRehearsalsUS,
    @SerialName("CompetitionsAU")
    val competitionsAU: CompetitionsAU,
    @SerialName("CompetitionsEU")
    val competitionsEU: CompetitionsEU,
    @SerialName("CompetitionsJP")
    val competitionsJP: CompetitionsJP,
    @SerialName("CompetitionsUS")
    val competitionsUS: CompetitionsUS,
    @SerialName("CostumeParty")
    val costumeParty: CostumeParty,
    @SerialName("DeepFog")
    val deepFog: DeepFog,
    @SerialName("FastMove")
    val fastMove: FastMove,
    @SerialName("Geyser")
    val geyser: Geyser,
    @SerialName("HighJump")
    val highJump: HighJump,
    @SerialName("Modified_Rainmaker")
    val modifiedRainmaker: ModifiedRainmaker,
    @SerialName("Modified_TowerControl")
    val modifiedTowerControl: ModifiedTowerControl,
    @SerialName("MonthlyLeagueMatchReal")
    val monthlyLeagueMatchReal: MonthlyLeagueMatchReal,
    @SerialName("NewSeasonCup")
    val newSeasonCup: NewSeasonCup,
    @SerialName("PairCup")
    val pairCup: PairCup,
    @SerialName("RainmakerDrop")
    val rainmakerDrop: RainmakerDrop,
    @SerialName("RandomWeapon")
    val randomWeapon: RandomWeapon,
    @SerialName("RandomWeaponAndGearPower")
    val randomWeaponAndGearPower: RandomWeaponAndGearPower,
    @SerialName("RollerBrushSpeedUp")
    val rollerBrushSpeedUp: RollerBrushSpeedUp,
    @SerialName("SpecialRush_JetPack")
    val specialRushJetPack: SpecialRushJetPack,
    @SerialName("SpecialRush_Skewer")
    val specialRushSkewer: SpecialRushSkewer,
    @SerialName("SpecialRush_UltraShot")
    val specialRushUltraShot: SpecialRushUltraShot,
    @SerialName("SpecialRush_UltraStamp")
    val specialRushUltraStamp: SpecialRushUltraStamp,
    @SerialName("SpecialRush_ZipCaster")
    val specialRushZipCaster: SpecialRushZipCaster,
    @SerialName("SuperBeacon")
    val superBeacon: SuperBeacon,
    @SerialName("SuperSpecialWeapon_Chariot")
    val superSpecialWeaponChariot: SuperSpecialWeaponChariot,
    @SerialName("SuperSubWeapon_CurlingBomb")
    val superSubWeaponCurlingBomb: SuperSubWeaponCurlingBomb,
    @SerialName("SuperSubWeapon_LineMarker")
    val superSubWeaponLineMarker: SuperSubWeaponLineMarker,
    @SerialName("SuperSubWeapon_SplashBomb")
    val superSubWeaponSplashBomb: SuperSubWeaponSplashBomb,
    @SerialName("Usually")
    val usually: Usually,
    @SerialName("UsuallyRehearsals")
    val usuallyRehearsals: UsuallyRehearsals,
    @SerialName("WeaponLimited_Blaster")
    val weaponLimitedBlaster: WeaponLimitedBlaster,
    @SerialName("WeaponLimited_Charger")
    val weaponLimitedCharger: WeaponLimitedCharger,
    @SerialName("WeaponLimited_Maneuver")
    val weaponLimitedManeuver: WeaponLimitedManeuver,
    @SerialName("WeaponLimited_RollerBrush")
    val weaponLimitedRollerBrush: WeaponLimitedRollerBrush,
    @SerialName("WeaponLimited_Shelter")
    val weaponLimitedShelter: WeaponLimitedShelter,
    @SerialName("WeaponLimited_Slosher")
    val weaponLimitedSlosher: WeaponLimitedSlosher,
    @SerialName("WeaponLimited_Spinner")
    val weaponLimitedSpinner: WeaponLimitedSpinner,
    @SerialName("XMatchPlayOff_EndOfSeason_GroupAtlantic")
    val xMatchPlayOffEndOfSeasonGroupAtlantic: XMatchPlayOffEndOfSeasonGroupAtlantic,
    @SerialName("XMatchPlayOff_EndOfSeason_GroupPacific")
    val xMatchPlayOffEndOfSeasonGroupPacific: XMatchPlayOffEndOfSeasonGroupPacific,
    @SerialName("XMatchPlayOff_GroupAtlantic")
    val xMatchPlayOffGroupAtlantic: XMatchPlayOffGroupAtlantic,
    @SerialName("XMatchPlayOff_GroupPacific")
    val xMatchPlayOffGroupPacific: XMatchPlayOffGroupPacific
)