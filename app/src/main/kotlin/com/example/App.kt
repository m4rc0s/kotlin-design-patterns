package com.example

import io.klogging.Level
import io.klogging.config.ANSI_INFO
import io.klogging.config.loggingConfiguration
import io.klogging.noCoLogger

private val logger = noCoLogger("App")

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    loggingConfiguration {
        ANSI_INFO()
        minDirectLogLevel(Level.INFO)
    }

    val app = App()
    logger.info("Starting app with greeting={greeting}", app.greeting)
    println(app.greeting)
}
