package com.cso.model

fun String.orUnknown() : String =
    if (this in exchangeRates.keys) this else "Unknown"

fun Double?.orZero() : Double =  this ?: 0.0