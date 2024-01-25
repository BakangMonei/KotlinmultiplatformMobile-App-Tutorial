package com.neizatheedev.kotlinmultiplatformmobileapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform