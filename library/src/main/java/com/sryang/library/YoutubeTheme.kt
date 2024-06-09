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

private val primary = Color(0xFF000000)
private val primaryContainer = Color(0xFF000000)
private val onPrimary = Color(0xFF000000)
private val onTertiary = Color(0xFFe3d6ab)
private val background = Color(0xFF000000)
private val secondary = Color(0xFF000000)
private val onSecondary = Color(0xFF000000)
private val onBackground = Color(0xFFd78258)
private val surface = Color(0xFF000000)
private val onSurface = Color(0xFFFFFFFF)
private val onSecondaryContainer = Color(0xFFFFFFFF)
private val secondaryContainer = Color(0xFF222222)
private val onSurfaceVariant = Color(0xFFFFFFFF)

private val rustThemeDark = darkColorScheme(
    primary = primary,
    secondary = secondary,
    surface = surface,
    primaryContainer = primaryContainer
)

private val youtubeThemeLight = lightColorScheme(
    primary = primary, // top app bar title,
    onPrimary = onPrimary,
    secondary = secondary,
    primaryContainer = primaryContainer, // bottom app bar background
    onSecondary = onSecondary, // contents color
    surface = surface, // bottom navigation bar background, top app bar background
    onSurface = onSurface,        // app bar text color
    onSurfaceVariant = onSurfaceVariant, // app bar action icons, bottom bar icons
    onBackground = onBackground,
    onTertiary = onTertiary,
//    onTertiaryContainer = Color.Blue,
    onSecondaryContainer = onSecondaryContainer, // selected bottom navigation item color
//    onPrimaryContainer = Color.Blue,
//    inversePrimary = Color.Blue,
    secondaryContainer = secondaryContainer, //bottom navigation item background
//    tertiary = Color.Blue,
//    tertiaryContainer = Color.Blue,
    background = background, // background
//    surfaceVariant = Color.Blue,
//    surfaceTint = Color.Blue,
//    inverseSurface = Color.Blue,
//    inverseOnSurface = Color.Blue,
//    error = Color.Blue,
//    onError = Color.Blue,
//    errorContainer = Color.Blue,
//    onErrorContainer = Color.Blue,
//    outline = Color.Blue,
//    outlineVariant = Color.Blue,
//    scrim = Color.Blue
)

private val LightElevation = Elevations()
private val DarkElevation = Elevations(card = 1.dp)
private val LightImages = Images(lockupLogo = R.drawable.ic_lockup_blue)
private val DarkImages = Images(lockupLogo = R.drawable.ic_lockup_white)

@Composable
fun YoutubeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) {
        rustThemeDark
    } else {
        youtubeThemeLight
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