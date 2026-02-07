package com.example.tugas1_123140186

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Tugas1_123140186",
    ) {
        App()
    }
}