package com.like_magic.fish100gramm.domain

data class Post(val title:String = "",
                val description:String = "",
                val date: Long = 0,
                val images:List<String> = listOf(),
                val likes:Int=0,
                val view:Int=0)