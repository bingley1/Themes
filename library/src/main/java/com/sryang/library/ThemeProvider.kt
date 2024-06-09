package com.sryang.library

import androidx.compose.runtime.Composable
import com.example.jetsnack.ui.theme.JetsnackTheme
import com.sryang.library.jetcaster.theme.JetcasterTheme
import com.sryang.library.jetsurvey.theme.JetsurveyTheme

object ThemeProvider

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
fun ThemeProvider.Jetcaster(contents: @Composable () -> Unit) {
    JetcasterTheme(content = contents)
}

@Composable
fun ThemeProvider.Jetsurvey(contents: @Composable () -> Unit) {
    JetsurveyTheme(content = contents)
}

@Composable
fun ThemeProvider.Jetsnack(contents: @Composable () -> Unit) {
    JetsnackTheme(content = contents)
}