package com.akmere.sample_library

import com.akmere.mylibrary.Factory
import com.akmere.mylibrary.UUIDFactory

class Config {

    private val factory: UUIDFactory = Factory()

    fun getId() =
        factory.create().generate()

}