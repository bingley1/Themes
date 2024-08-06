package com.sryang.library

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
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

private val primary = Color(0xFFFFFFFF)
private val primaryContainer = Color(0xFFFFFFFF)
private val onPrimary = Color(0xFF000000)
private val onTertiary = Color(0xFFe3d6ab)
private val background = Color(0xFF000000)
private val secondary = Color(0xFFFFFFFF)
private val onSecondary = Color(0xFF000000)
private val onBackground = Color(0xFFFFFFFF)
private val surface = Color(0xFF111111)
private val onSurface = Color(0xFFFFFFFF)
private val onSecondaryContainer = Color(0xFFFFFFFF)
private val secondaryContainer = Color(0xFF444444)
private val onSurfaceVariant = Color(0xFFFFFFFF)
private val outline = Color(0xFFFFFFFF)
private val surfaceVariant = Color(0xFF222222)

/**
 * button
 * @param onPrimary filled button text color
 * @param surface elevatedButton background
 * @param primary button(Outlined, elevated, text) text color
 * @param outline outline button color
 * @param onSecondaryContainer tonal button background
 * @param secondaryContainer tonal background
 * @param primaryContainer bottom app bar background
 * @param surface bottom navigation bar background, top app bar background, elevatedButton background
 * @param surfaceVariant textField Container
 */
private val youtubeThemeLight = lightColorScheme(
    primary = primary, // top app bar title
    onPrimary = onPrimary,
    secondary = secondary,
    primaryContainer = primaryContainer,
    onSecondary = onSecondary, // contents color
    surface = surface,
    onSurface = onSurface,        // app bar text color
    onSurfaceVariant = onSurfaceVariant, // app bar action icons, bottom bar icons
    onBackground = onBackground,
    onTertiary = onTertiary,
    onSecondaryContainer = onSecondaryContainer, // selected bottom navigation item color
    secondaryContainer = secondaryContainer, //bottom navigation item background
    background = background, // background
    outline = outline,
//    onTertiaryContainer = Color.Blue,
//    onPrimaryContainer = Color.Blue,
//    inversePrimary = Color.Blue,
//    tertiary = Color.Blue,
//    tertiaryContainer = Color.Blue,
    surfaceVariant = surfaceVariant,
//    surfaceTint = Color.Blue,
//    inverseSurface = Color.Blue,
//    inverseOnSurface = Color.Blue,
//    error = Color.Blue,
//    onError = Color.Blue,
//    errorContainer = Color.Blue,
//    onErrorContainer = Color.Blue,
//    outlineVariant = Color.Blue,
//    scrim = Color.Blue
)

private val LightElevation = Elevations()
private val DarkElevation = Elevations(card = 1.dp)
private val LightImages = Images(lockupLogo = R.drawable.ic_lockup_blue)
private val DarkImages = Images(lockupLogo = R.drawable.ic_lockup_white)

@Composable
fun Youtube(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) {
        youtubeThemeLight
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
            content = content,
            shapes = Shapes(
//                extraSmall = RoundedCornerShape(0.dp),
//                extraLarge = RoundedCornerShape(0.dp),
//                small = RoundedCornerShape(0.dp),
//                medium = CutCornerShape(12.dp),
//                large = RoundedCornerShape(0.dp),
            )
        )
    }

}