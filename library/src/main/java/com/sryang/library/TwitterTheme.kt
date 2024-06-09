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

val blue200 = Color(0xff91a4fc)
val blue700 = Color(0xff0336ff)
val blue800 = Color(0xff0035c9)
val blueDarkPrimary = Color(0xff1c1d24)

val twitterBlue = Color(0xff1da1f2)
val twitterBlack = Color(0xff14171a)
val twitterDkGrey = Color(0xff657786)
val twitterGrey = Color(0xffaab8c2)
val twitterLtGrey = Color(0xffe1e8ed)

private val TwitterThemeDark = darkColorScheme(
    primary = blue200,
    secondary = yellow200,
    surface = blueDarkPrimary,
    primaryContainer = blue700
)

private val TwitterThemeLight = lightColorScheme(
    primary = twitterLtGrey, // top app bar title,
    onPrimary = Color.White,
    secondary = Color.White,
    primaryContainer = twitterBlue, // bottom app bar background
    onSecondary = twitterBlack, // contents color
    surface = twitterBlue, // bottom navigation bar background, top app bar background
//    onSurface = Color.White,        // app bar text color
//    onSurfaceVariant = Color.White, // app bar action icons
    onBackground = Color.White,
    onTertiary = Color.White,
    onTertiaryContainer = Color.White,
    onSecondaryContainer = Color.White,
    onPrimaryContainer = Color.White,
    inversePrimary = Color.White,
    secondaryContainer = twitterDkGrey, //bottom navigation item background
    tertiary = Color.White,
    tertiaryContainer = Color.White,
    background = twitterBlue, // background
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
fun TwitterTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) {
        TwitterThemeDark
    } else {
        TwitterThemeLight
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