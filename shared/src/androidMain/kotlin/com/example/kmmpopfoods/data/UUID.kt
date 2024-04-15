package com.example.kmmpopfoods.data

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class UUID actual constructor(uuidString: String) {
    private var uuid: java.util.UUID = java.util.UUID.fromString(uuidString)

    actual companion object {
        actual fun randomUUID(): UUID = UUID(java.util.UUID.randomUUID().toString())
    }

    actual override fun toString(): String = uuid.toString()
}
