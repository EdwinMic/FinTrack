package com.example.fintrack

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform