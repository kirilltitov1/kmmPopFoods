package com.example.kmmpopfoods.data

import platform.Foundation.NSUUID

actual class UUID actual constructor() {
    private val uuid: NSUUID = NSUUID.UUID()

    actual companion object {
        actual fun randomUUID(): UUID = UUID()
    }

    actual override fun toString(): String = uuid.UUIDString()
}