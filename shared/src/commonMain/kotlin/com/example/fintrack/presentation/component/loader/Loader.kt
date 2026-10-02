package com.example.fintrack.presentation.component.loader

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.fintrack.presentation.component.container.SafeScreenContainerTest
import com.example.fintrack.presentation.theme.AppTheme
import com.example.fintrack.presentation.theme.Dimens
import com.example.fintrack.presentation.utils.operator.StatusLoading

@Composable
fun Loader(
    modifier: Modifier = Modifier,
    backgroundColor: Color = AppTheme.colors.backgroundProgressIndicator,
    progressColor: Color = AppTheme.colors.primary,
    isLoading: StatusLoading = StatusLoading.DISMISS_LOADING,
) {
    if (isLoading == StatusLoading.SHOW_LOADING) {
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(color = backgroundColor),
            contentAlignment = Alignment.Center,
        ) {
            CircularProgressIndicator(
                color = progressColor,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LoaderPreview() {
    SafeScreenContainerTest {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(Dimens.padding16),
        ) {
            Loader(isLoading = StatusLoading.SHOW_LOADING)
        }
    }
}
