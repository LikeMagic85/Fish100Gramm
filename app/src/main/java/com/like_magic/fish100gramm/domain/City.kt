package com.like_magic.fish100gramm.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class City(var name: String="", var lat: Double = 53.902284, var lon: Double=27.561831):
    Parcelable