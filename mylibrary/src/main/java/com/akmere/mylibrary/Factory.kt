package com.akmere.mylibrary

class Factory: UUIDFactory {
    override fun create(): UUIDGenerator {
        return Generator
    }
}