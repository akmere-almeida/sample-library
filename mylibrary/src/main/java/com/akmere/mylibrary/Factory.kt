package com.akmere.mylibrary

class Factory: UUIDFactory {
    override fun create(): Generator<String> =
        UUIDGenerator
}