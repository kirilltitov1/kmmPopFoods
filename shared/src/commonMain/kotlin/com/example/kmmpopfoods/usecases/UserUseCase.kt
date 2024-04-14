package com.example.kmmpopfoods.usecases

import com.example.kmmpopfoods.data.User
import com.example.kmmpopfoods.service.UserService

class UserUseCase(private var userService: UserService) : BaseUseCase<Unit, User?>() {
    override suspend fun execute(param: Unit): User? {
        return try {
            userService.loadUser()?.getOrNull()
        } catch (e: Exception) {
            throw e
        }
    }
}