package com.neizatheedev.kotlinmultiplatformmobileapp

class Greeting {
    private val platform: Platform = getPlatform()

    var name : String = "@NeizaTheeDev"

    fun greet(): String {
        return "Hello, ${name}!"
    }
}