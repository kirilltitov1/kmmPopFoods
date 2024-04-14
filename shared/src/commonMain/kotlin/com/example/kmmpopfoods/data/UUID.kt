
package com.example.kmmpopfoods.data

import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect class UUID() {
    companion object {
        fun randomUUID(): UUID
    }
    override fun toString(): String
}
