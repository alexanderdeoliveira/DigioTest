package com.alexander.digiotest.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Response(
    @SerializedName("spotlight")
    val spotlights: List<Spotlight>,
    val products: List<Product>,
    val banner: Banner
) : Parcelable
