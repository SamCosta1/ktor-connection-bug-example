package com.example.ktorbug

import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

object ServerContainer {

    private var server: ApplicationEngine? = null

    fun startServer() = embeddedServer(CIO, port = 8080) {
        routing {
            get("/") {
                call.respondText("Hello, world!")
            }
        }
    }.start(wait = false).also {
        server = it
    }

    fun stopServer() {
        server?.stop()
        server = null
    }
}

//Uncaught Kotlin exception: io.ktor.utils.io.errors.PosixException.AddressAlreadyInUseException: EADDRINUSE (48): Address already in use