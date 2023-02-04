package com.example.ktorbug

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

object RunExample {

    fun thisCrashesOniOSUponAppRelaunch() = GlobalScope.launch {
        ServerContainer.startServer()
        Client.makeNetworkCall(addCloseHeader = true)
    }

    fun stopServer() = ServerContainer.stopServer()
}