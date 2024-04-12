package com.example.kmmpopfoods

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform