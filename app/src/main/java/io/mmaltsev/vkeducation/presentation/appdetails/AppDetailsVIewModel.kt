package io.mmaltsev.vkeducation.presentation.appdetails

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.mmaltsev.vkeducation.domain.appdetails.GetAppDetailsUseCase
import io.mmaltsev.vkeducation.presentation.applist.AppCatalog
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AppDetailsViewModel @Inject constructor(
    private val getAppDetailsUseCase: GetAppDetailsUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val appId: String =
        savedStateHandle["id"] ?: error("id is required")

    // ---- STATE ----
    private val _state = MutableStateFlow<AppDetailsState>(AppDetailsState.Loading)
    val state = _state.asStateFlow()

    // ---- EVENTS ----
    private val _events = MutableSharedFlow<AppDetailsEvent>()
    val events = _events.asSharedFlow()

    init {
        load()
    }

    private fun sendEvent(event: AppDetailsEvent) {
        viewModelScope.launch {
            _events.emit(event)
        }
    }

    // ---- LOAD APP ----
    fun load() {
        viewModelScope.launch {
            _state.value = AppDetailsState.Loading

            val app = AppCatalog.apps.find { it.id == appId }

            if (app == null) {
                _state.value = AppDetailsState.Error
            } else {
                _state.value = AppDetailsState.Content(
                    appDetails = app,
                    descriptionCollapsed = true
                )
            }
        }
    }

    // ---- EVENTS ----
    fun showUnderDevelopmentMessage() {
        sendEvent(AppDetailsEvent.UnderDevelopment)
    }

    fun collapseDescription() {
        _state.update { current ->
            if (current is AppDetailsState.Content) {
                current.copy(descriptionCollapsed = false)
            } else current
        }
    }

    // ---- INSTALL ----
    fun installApp() {
        val current = _state.value
        if (current is AppDetailsState.Content) {
            _state.value = current.copy(
                appDetails = current.appDetails.copy(isInstalled = true)
            )
            sendEvent(AppDetailsEvent.Installed(appName = current.appDetails.name))
        }
    }

    // ---- UNINSTALL ----
    fun uninstallApp() {
        val current = _state.value
        if (current is AppDetailsState.Content) {
            _state.value = current.copy(
                appDetails = current.appDetails.copy(isInstalled = false)
            )
            sendEvent(AppDetailsEvent.Uninstalled(appName = current.appDetails.name))
        }
    }
}
