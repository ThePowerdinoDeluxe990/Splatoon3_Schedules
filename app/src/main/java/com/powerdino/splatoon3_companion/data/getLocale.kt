package com.powerdino.splatoon3_companion.data

import android.util.Log
import java.util.Locale

fun getLocale(): String {
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

    val locale = Locale.getDefault().country + Locale.getDefault().language
/*
    val realLocale = when(locale.get(2)){
        else -> locale
    }

 */
    Log.i("locale lang",locale)
    var currentLang = "USen"

    listOfLangs.forEach { lang ->

        if (locale == lang){
            currentLang = lang
        }
    }
    Log.i("Current lang", currentLang)
    return currentLang
}