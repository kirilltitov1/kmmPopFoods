package com.example.kmmpopfoods.data

import platform.Foundation.NSUUID

actual class UUID actual constructor(uuidString: String) {
    private var uuid: NSUUID = NSUUID(uUIDString = uuidString) ?: NSUUID()

    actual companion object {
        actual fun randomUUID(): UUID = UUID(NSUUID().UUIDString())
    }

    actual override fun toString(): String = uuid.UUIDString()
}
