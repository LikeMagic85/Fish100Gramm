package com.like_magic.fish100gramm.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Contact(var phone: String = "",
                   var email:String = "",
                   var viber: String = "",
                   var telegram:String = ""):Parcelable