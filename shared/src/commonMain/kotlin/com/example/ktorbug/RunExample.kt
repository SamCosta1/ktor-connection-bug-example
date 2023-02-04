package com.example.ktorbug

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

object RunExample {

    fun thisCrashesOniOS() = GlobalScope.launch {
        ServerContainer.startServer()
        Client.makeNetworkCall(addCloseHeader = true)
        ServerContainer.stopServer()
        ServerContainer.startServer()
    }

    fun thisDoesNotCrash() = GlobalScope.launch {
        ServerContainer.startServer()
        Client.makeNetworkCall(addCloseHeader = false)
        ServerContainer.stopServer()
        ServerContainer.startServer()
    }

    fun stopServer() = ServerContainer.stopServer()
}