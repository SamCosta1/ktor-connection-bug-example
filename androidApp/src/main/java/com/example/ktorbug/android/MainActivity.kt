package com.example.ktorbug.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*

import com.example.ktorbug.RunExample

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        RunExample.thisCrashesOniOSUponAppRelaunch()
//        RunExample.thisDoesNotCrash()

        setContent {
           Text("Hello")
        }
    }
}
