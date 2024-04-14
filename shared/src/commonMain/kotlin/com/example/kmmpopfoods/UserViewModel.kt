package com.example.kmmpopfoods

import com.example.kmmpopfoods.usecases.UserUseCase
import com.example.kmmpopfoods.data.User
import com.example.kmmpopfoods.threads.ioDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class UserViewModel(private  val useCase: UserUseCase): BaseViewModel() {
    var userFlow = MutableStateFlow<User?>(null)

    fun loadUser() {
        scope.launch {
            val result = withContext(ioDispatcher) {
                useCase.invoke(Unit)
            }
            result.getOrNull()?.let {
                userFlow.tryEmit(it)
            }
        }
    }
}