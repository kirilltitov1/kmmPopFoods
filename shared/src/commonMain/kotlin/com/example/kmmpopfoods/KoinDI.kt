package com.example.kmmpopfoods

import com.example.kmmpopfoods.http.NetworkClient
import com.example.kmmpopfoods.service.UserService
import com.example.kmmpopfoods.usecases.UserUseCase
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin
import org.koin.dsl.module
import kotlin.reflect.KClass

class KoinDI : KoinComponent {
    val serviceModule = module {
        single { NetworkClient() }
        single { UserService(get()) }
    }

    val usecaseModule = module {
        factory {
            UserUseCase(get())
        }
    }

    val vmModule = module {
        factory<UserViewModel> { UserViewModel(get()) }
    }

    fun start() = startKoin {
        modules(listOf(serviceModule, usecaseModule, vmModule))
    }
}

object KoinDIFactory {
    val di by lazy {
        KoinDI().apply {
            start()
        }
    }
}

fun<T: Any> KoinDIFactory.resolve(classType: KClass<T>): T? {
    return KoinDIFactory.di.getKoin().get(classType)
}