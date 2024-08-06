package com.sryang.library

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.scaffold.owl.theme.Typography
import com.sryang.library.owl.theme.Elevations
import com.sryang.library.owl.theme.Images
import com.sryang.library.owl.theme.LocalElevations
import com.sryang.library.owl.theme.LocalImages

val blue100 = Color(0xFFC9D2FF)
val blue200 = Color(0xff91a4fc)
val blue300 = Color(0xFF9CABFA)
val blue500 = Color(0xFF5570FA)
val blue700 = Color(0xff0336ff)
val blue800 = Color(0xff002473)
val blue900 = Color(0xff001d64)
val blueDarkPrimary = Color(0xff1c1d24)

private val background = blue100
private val primaryContainer = blue200
private val primary = blue800
private val outline = blue500
private val surface = blue300
private val onSecondaryContainer = blue900
private val onPrimary = blue100
private val secondaryContainer = blue500
private val surfaceVariant = blue300


/**
 * button
 * @param onPrimary filled button text color
 * @param surface elevatedButton background
 * @param primary button(Outlined, elevated, text) text color
 * @param outline outline button color
 * @param onSecondaryContainer tonal button Text Color
 * @param secondaryContainer tonal button background
 * @param primaryContainer bottom app bar background
 * @param surface bottom navigation bar background, top app bar background, elevatedButton background
 * @param surfaceVariant textField Container
 */
private val BlueThemeLight = lightColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    secondary = blue700,
    surface = surface,
    onSecondary = Color.White,
    primaryContainer = primaryContainer,
    background = background,
    outline = outline,
    onSecondaryContainer = onSecondaryContainer,
    secondaryContainer = secondaryContainer,
    surfaceVariant = surfaceVariant
)

private val BlueThemeDark = darkColorScheme(
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

private val LightElevation = Elevations()

private val DarkElevation = Elevations(card = 1.dp)

private val LightImages = Images(lockupLogo = R.drawable.ic_lockup_blue)

private val DarkImages = Images(lockupLogo = R.drawable.ic_lockup_white)

@Composable
fun TwitterTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) {
        BlueThemeDark
    } else {
        BlueThemeLight
    }


    val elevation = if (darkTheme) DarkElevation else LightElevation
    val images = if (darkTheme) DarkImages else LightImages
    CompositionLocalProvider(
        LocalElevations provides elevation,
        LocalImages provides images
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            shapes = MaterialTheme.shapes,
            content = content
        )
    }

}