package com.like_magic.fish100gramm.domain

data class User(
    val name:String,
    val city:City,
    val age:Int,
    var contact: Contact = Contact(),
    var key:String? = null,
    var uid:String? = null,
    var uriImage:String = "",
    val posts: List<Post> = listOf()
)