package com.sryang.library

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sryang.library.owl.theme.Elevations
import com.sryang.library.owl.theme.Images
import com.sryang.library.owl.theme.LocalElevations
import com.sryang.library.owl.theme.LocalImages

private val primary = Color(0xFF778979)
private val primaryContainer = Color(0xFFccdcc1)
private val onTertiary = Color(0xFFe3d6ab)
private val background = Color(0xFFccdcc1)
private val secondary = Color(0xFFa9916b)
private val onBackground = Color(0xFFd78258)
private val surface = Color(0xFFccdcc1)

private val rustThemeDark = darkColorScheme(
    primary = primary,
    secondary = secondary,
    surface = surface,
    primaryContainer = primaryContainer
)

private val rustThemeLight = lightColorScheme(
    primary = primary, // top app bar title,
    onPrimary = Color.White,
    secondary = secondary,
    primaryContainer = primaryContainer, // bottom app bar background
    onSecondary = secondary, // contents color
    surface = surface, // bottom navigation bar background, top app bar background
//    onSurface = Color.White,        // app bar text color
//    onSurfaceVariant = Color.White, // app bar action icons
    onBackground = onBackground,
    onTertiary = onTertiary,
    onTertiaryContainer = Color.White,
    onSecondaryContainer = Color.White,
    onPrimaryContainer = Color.White,
    inversePrimary = Color.White,
    secondaryContainer = secondary, //bottom navigation item background
    tertiary = Color.White,
    tertiaryContainer = Color.White,
    background = background, // background
    surfaceVariant = Color.White,
    surfaceTint = Color.White,
    inverseSurface = Color.White,
    inverseOnSurface = Color.White,
    error = Color.White,
    onError = Color.White,
    errorContainer = Color.White,
    onErrorContainer = Color.White,
    outline = Color.White,
    outlineVariant = Color.White,
    scrim = Color.White
)

private val LightElevation = Elevations()
private val DarkElevation = Elevations(card = 1.dp)
private val LightImages = Images(lockupLogo = R.drawable.ic_lockup_blue)
private val DarkImages = Images(lockupLogo = R.drawable.ic_lockup_white)

@Composable
fun RusticTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) {
        rustThemeDark
    } else {
        rustThemeLight
    }

    val elevation = if (darkTheme) DarkElevation else LightElevation
    val images = if (darkTheme) DarkImages else LightImages

    CompositionLocalProvider(
        LocalElevations provides elevation,
        LocalImages provides images,
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            content = content
        )
    }

}