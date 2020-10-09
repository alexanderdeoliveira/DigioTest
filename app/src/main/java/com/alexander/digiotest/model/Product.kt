package com.alexander.digiotest.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
    val name: String,
    val imageURL: String,
    val description: String
) : Parcelable