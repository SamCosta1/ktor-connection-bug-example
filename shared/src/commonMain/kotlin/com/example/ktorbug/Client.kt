package com.example.ktorbug

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.utils.io.core.*

object Client {
    suspend fun makeNetworkCall(addCloseHeader: Boolean) = HttpClient(CIO).use { client ->
        val response = runCatching {
            client.get("http://localhost:8080/") {
                if (addCloseHeader) {
                    headers.append("Connection", "close")
                }
                println("Making request with headers ${headers.entries()}")
            }
        }
        println("Got response $response")
    }
}