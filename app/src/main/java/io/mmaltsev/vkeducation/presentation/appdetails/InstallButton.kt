package io.mmaltsev.vkeducation.presentation.appdetails

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.mmaltsev.vkeducation.R
import io.mmaltsev.vkeducation.presentation.theme.VkEducationTheme

@Composable
fun InstallButton(
    installed: Boolean,
    onInstallClick: () -> Unit,
    onUninstallClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = {
            if (installed) onUninstallClick() else onInstallClick()
        },
        modifier = modifier
    ) {
        Text(if (installed) "Удалить" else "Установить")
    }
}

@Preview
@Composable
private fun Preview() {
    VkEducationTheme {
        InstallButton(
            installed = false,
            onInstallClick = {},
            onUninstallClick = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}
