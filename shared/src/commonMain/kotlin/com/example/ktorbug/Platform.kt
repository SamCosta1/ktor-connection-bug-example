package com.example.ktorbug

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform