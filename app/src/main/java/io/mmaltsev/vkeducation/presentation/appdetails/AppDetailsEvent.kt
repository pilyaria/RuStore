package io.mmaltsev.vkeducation.presentation.appdetails

sealed interface AppDetailsEvent {
    data object UnderDevelopment : AppDetailsEvent
    data class Installed(val appName: String) : AppDetailsEvent
    data class Uninstalled(val appName: String) : AppDetailsEvent
}