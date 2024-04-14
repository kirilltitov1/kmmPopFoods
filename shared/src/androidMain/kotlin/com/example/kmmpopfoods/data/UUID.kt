package com.example.kmmpopfoods.data

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class UUID actual constructor() {
    private val uuid: java.util.UUID = java.util.UUID.randomUUID()

    actual companion object {
        actual fun randomUUID(): UUID = UUID()
    }

    actual override fun toString(): String = uuid.toString()
}
