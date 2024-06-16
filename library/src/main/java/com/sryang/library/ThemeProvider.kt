package com.sryang.library

import androidx.compose.runtime.Composable
import com.example.jetsnack.ui.theme.JetsnackTheme
import com.sryang.library.jetcaster.theme.JetcasterTheme
import com.sryang.library.jetsurvey.theme.JetsurveyTheme

object ThemeProvider

@Composable
fun ThemeProvider.Youtube(contents: @Composable () -> Unit) {
    Youtube(content = contents)
}

@Composable
fun ThemeProvider.RusticTheme(contents: @Composable () -> Unit) {
    RusticTheme(content = contents)
}

@Composable
fun ThemeProvider.Twitter(contents: @Composable () -> Unit) {
    TwitterTheme(content = contents)
}

@Composable
fun ThemeProvider.Pink(contents: @Composable () -> Unit) {
    PinkTheme(content = contents)
}

@Composable
fun ThemeProvider.Yellow(contents: @Composable () -> Unit) {
    YellowTheme(content = contents)
}

@Composable
fun ThemeProvider.JetCaster(contents: @Composable () -> Unit) {
    JetcasterTheme(content = contents)
}

@Composable
fun ThemeProvider.JetSurvey(contents: @Composable () -> Unit) {
    JetsurveyTheme(content = contents)
}

@Composable
fun ThemeProvider.JetSnack(contents: @Composable () -> Unit) {
    JetsnackTheme(content = contents)
}

sealed class ThemeTypes(
    val name: String,
    val contents: @Composable (@Composable () -> Unit) -> Unit
) {
    object Pink : ThemeTypes("Pink", { ThemeProvider.Pink(it) })
    object Yellow : ThemeTypes("Yellow", { ThemeProvider.Yellow(it) })
    object Twitter : ThemeTypes("Twitter", { ThemeProvider.Twitter(it) })
    object Youtube : ThemeTypes("Youtube", { ThemeProvider.Youtube(it) })
    object JetCaster : ThemeTypes("JetCaster", { ThemeProvider.JetCaster(it) })
    object JetSurvey : ThemeTypes("JetSurvey", { ThemeProvider.JetSurvey(it) })
    object JetSnack : ThemeTypes("JetSnack", { ThemeProvider.JetSnack(it) })
    object RusticTheme : ThemeTypes("RusticTheme", { ThemeProvider.RusticTheme(it) })
}

val themeTypeList = listOf(
    ThemeTypes.Pink,
    ThemeTypes.Yellow,
    ThemeTypes.Twitter,
    ThemeTypes.Youtube,
    ThemeTypes.JetCaster,
    ThemeTypes.JetSurvey,
    ThemeTypes.JetSnack,
    ThemeTypes.RusticTheme,
)