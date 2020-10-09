package com.alexander.digiotest.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Response(
    val spotlights: List<Spotlight>,
    val products: List<Product>,
    val banner: Banner
) : Parcelable