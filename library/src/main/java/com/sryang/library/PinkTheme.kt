package com.sryang.library

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sryang.library.owl.theme.OwlTheme

val pink200 = Color(0xffff7597)
val pink500 = Color(0xffff0266)
val pink600 = Color(0xffd8004d)
val pinkDarkPrimary = Color(0xff24191c)


val black200 = Color(0xffDEDEDE)
val black400 = Color(0xffAEAEAE)
val black600 = Color(0xff000000)

private val PinkThemeLight = lightColorScheme(
    primary = Color.Black,
    secondary = pink500,
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    primaryContainer = pink200,
    background = pink200,
    surface = pink200
)

private val PinkThemeDark = darkColorScheme(
    primary = pink200,
    secondary = pink200,
    primaryContainer = pink500,
    background = pink500,
    surface = pink200
)

@Composable
fun PinkTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) {
        PinkThemeDark
    } else {
        PinkThemeLight
    }
    OwlTheme(darkTheme, colors, content)
}