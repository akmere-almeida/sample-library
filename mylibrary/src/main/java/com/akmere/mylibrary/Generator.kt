package com.akmere.mylibrary

import java.util.UUID

internal class Generator : UUIDGenerator() {
    override fun generate(): String {
        return UUID.randomUUID().toString()
    }
}