package com.example.kmmpopfoods.http

class NetworkConfig {
    companion object shared {
        val apiUrl = ""
        val apiKey = ""

        val header: HashMap<String, String> = hashMapOf("X-Api-Key" to apiKey)
    }
}