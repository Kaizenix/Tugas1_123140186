package com.example.tugas1_123140186

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform