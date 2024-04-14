package com.example.kmmpopfoods.service

import com.example.kmmpopfoods.data.*
import com.example.kmmpopfoods.http.NetworkClient
import com.example.kmmpopfoods.http.NetworkConfig

class UserService(private val httpClient: NetworkClient) {

    suspend fun loadUser(): Result<User> {
        return httpClient.request(URL)
    }

    companion object {
        val URL = "https://newsapi.org/v2/everything?q=science&apiKey=${NetworkConfig.apiKey}"
    }
}