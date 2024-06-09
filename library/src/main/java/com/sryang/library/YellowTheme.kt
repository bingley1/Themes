package com.sryang.library

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sryang.library.owl.theme.OwlTheme

val yellow200 = Color(0xffffeb46)
val yellow400 = Color(0xffffc000)
val yellow500 = Color(0xffffde03)
val yellowDarkPrimary = Color(0xff242316)

private val YellowThemeLight = lightColorScheme(
    primary = Color.Black,
    onPrimary = Color.Black,
    secondary = blue700,
    surface = yellow200,
    onSecondary = Color.White,
    primaryContainer = yellow200,
    background = yellow200
)

private val YellowThemeDark = darkColorScheme(
    primary = yellow200,
    secondary = blue200,
    onSecondary = Color.Black,
    surface = yellow200,
    primaryContainer = yellow200,
    background = yellow200,
)

@Composable
fun YellowTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) {
        YellowThemeDark
    } else {
        YellowThemeLight
    }
    OwlTheme(darkTheme, colors, content)
}
