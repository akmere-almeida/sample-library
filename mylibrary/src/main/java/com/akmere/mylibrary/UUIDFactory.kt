package com.akmere.mylibrary

interface UUIDFactory {
    fun create(): Generator<String>
}