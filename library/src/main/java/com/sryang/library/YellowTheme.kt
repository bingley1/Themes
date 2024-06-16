package com.sryang.library

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sryang.library.owl.theme.OwlTheme

private val yellow150 = Color(0xFFFFF5A2)
private val yellow100 = Color(0xFFFFF9C9)
private val yellow200 = Color(0xffffeb46)
private val yellow400 = Color(0xffffc000)
private val yellow500 = Color(0xffffde03)
private val yellow700 = Color(0xFFFFDD00)
private val Brown700 = Color(0xFF763a12)
private val Brown500 = Color(0xFFAA4C0A)
private val Brown300 = Color(0xFFE08500)
private val yellprivateowDarkPrimary = Color(0xff242316)

private val background = yellow100
private val primaryContainer = yellow200
private val primary = Brown700
private val outline = yellow500
private val surface = yellow150
private val onSecondaryContainer = Brown700
private val onPrimary = yellow100
private val secondaryContainer = Brown300


/**
 * button
 * @param onPrimary filled button text color
 * @param surface elevatedButton background
 * @param primary button(Outlined, elevated, text) text color
 * @param outline outline button color
 * @param onSecondaryContainer tonal button Text Color
 * @param secondaryContainer tonal button background
 */
private val YellowThemeLight = lightColorScheme(
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
