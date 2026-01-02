package com.powerdino.splatoon3_companion.data

import android.annotation.SuppressLint
import com.powerdino.splatoon3_companion.model.Data
import com.powerdino.splatoon3_companion.model.salmon_run.Salmon
import com.powerdino.splatoon3_companion.model.salmon_run.resources.SalmonResources
import com.powerdino.splatoon3_companion.service.RetroFitService
import java.util.Locale


interface SplatoonRepository {
    suspend fun getSplatoonData(): Data
    suspend fun getSalmonResources(): SalmonResources
    suspend fun getSalmonSchedule(): Salmon
    suspend fun getLocale():String
}

class NetworkSplatoonRepository(
    private val splatoonApiService:RetroFitService
): SplatoonRepository{
    override suspend fun getLocale(): String {
        val listOfLangs = listOf(
            "JPja",
            "USen",
            "USes",
            "USfr",
            "USpt",
            "EUen",
            "EUes",
            "EUfr",
            "EUde",
            "EUit",
            "EUpt",
            "EUnl",
            "EUru",
            "KRko",
            "CNzh",
            "TWzh"
        )

        val locale = Locale.getDefault().getCountry() + Locale.getDefault().getLanguage()

        var currentLang = "USen"

        listOfLangs.forEach { lang ->
            if (locale == lang){
                currentLang = lang
            }
        }
        return currentLang
    }
    override suspend fun getSplatoonData(): Data = splatoonApiService.getData()
    override suspend fun getSalmonResources(): SalmonResources = splatoonApiService.getSalmonResources(getLocale())
    override suspend fun getSalmonSchedule(): Salmon = splatoonApiService.getSalmonSchedules()
}