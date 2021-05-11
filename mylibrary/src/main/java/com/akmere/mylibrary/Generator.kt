package com.akmere.mylibrary

import java.util.UUID

internal object Generator : UUIDGenerator() {
    private var uuid: String? = null
    override fun generate(): String {
        if (uuid.isNullOrEmpty())
            uuid = UUID.randomUUID().toString()

        return uuid!!
    }
}