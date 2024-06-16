package com.sryang.library

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sryang.library.owl.theme.OwlTheme

private val pink100 = Color(0xFFF8A1B6)
private val pink150 = Color(0xFFFF94AE)
private val pink200 = Color(0xFFFFADC1)
private val pink300 = Color(0xFFF15D81)
private val pink500 = Color(0xffff0266)
private val pink600 = Color(0xffd8004d)
private val pinkDarkPrimary = Color(0xff24191c)


private val black200 = Color(0xffDEDEDE)
private val black400 = Color(0xffAEAEAE)
private val black500 = Color(0xFF696262)
private val black600 = Color(0xFF1D1A1A)

private val background = pink100
private val primaryContainer = pink200
private val primary = black600
private val outline = pink500
private val surface = pink300
private val onSecondaryContainer = black600
private val onPrimary = pink100
private val secondaryContainer = black500

/**
 * button
 * @param onPrimary filled button text color
 * @param surface elevatedButton background
 * @param primary button(Outlined, elevated, text) text color
 * @param outline outline button color
 * @param onSecondaryContainer tonal button Text Color
 * @param secondaryContainer tonal button background
 */
private val PinkThemeLight = lightColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    secondary = blue700,
    surface = surface,
    onSecondary = Color.White,
    primaryContainer = primaryContainer,
    background = background,
    outline = outline,
    onSecondaryContainer = onSecondaryContainer,
    secondaryContainer = secondaryContainer
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