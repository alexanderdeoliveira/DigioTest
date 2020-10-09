package com.alexander.digiotest.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Spotlight(
    val name: String,
    val bannerURL: String,
    val description: String
) : Parcelable