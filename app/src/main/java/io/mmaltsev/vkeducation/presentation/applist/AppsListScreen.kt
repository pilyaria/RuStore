package io.mmaltsev.vkeducation.presentation.applist

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.mmaltsev.vkeducation.domain.appdetails.AppDetails

@Composable
fun AppsListScreen(
    apps: List<AppDetails>,
    onAppClick: (AppDetails) -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(12.dp)
    ) {
        items(apps) { app ->
            AppListItem(
                app = app,
                onClick = { onAppClick(app) }
            )
        }
    }
}
