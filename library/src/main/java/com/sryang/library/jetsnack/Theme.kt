/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sryang.library.jetsnack

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.example.jetsnack.ui.theme.FunctionalRed
import com.example.jetsnack.ui.theme.Neutral0
import com.example.jetsnack.ui.theme.Neutral1
import com.example.jetsnack.ui.theme.Neutral4
import com.example.jetsnack.ui.theme.Neutral7
import com.example.jetsnack.ui.theme.Ocean11
import com.example.jetsnack.ui.theme.Ocean3
import com.example.jetsnack.ui.theme.Shadow5
import com.example.jetsnack.ui.theme.Typography


@Composable
fun JetsnackTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = debugColors(),
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}


fun debugColors() = lightColorScheme(
    primary = Shadow5,
    secondary = Ocean3,
    background = Neutral0,
    surface = Neutral4,
    error = FunctionalRed,
    onPrimary = Neutral7,
    onSecondary = Neutral7,
    onBackground = Neutral1,
    onSurface = Neutral1,
    onError = Ocean11,
)
