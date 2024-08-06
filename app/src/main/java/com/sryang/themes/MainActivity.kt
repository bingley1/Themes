package com.sryang.themes

import YoutubeBottomBar
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.library.Buttons
import com.sryang.library.BottomBarsProvider
import com.sryang.library.JetCaster
import com.sryang.library.JetSnack
import com.sryang.library.JetSurvey
import com.sryang.library.JetsnackScaffold
import com.sryang.library.Pink
import com.sryang.library.ThemeProvider
import com.sryang.library.Twitter
import com.sryang.library.Yellow
import com.sryang.library.Youtube
import com.sryang.library.themeTypeList
import com.sryang.topappbar.TopAppBarProvider
import com.sryang.topappbar.YoutubeTopAppBar

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val height = 40.dp
            val themePageState = rememberPagerState { themeTypeList.size }

            var selectedTheme by remember { mutableStateOf(themeTypeList[0]) }

            LaunchedEffect(key1 = themePageState) {
                snapshotFlow {
                    themePageState.currentPage
                }.collect {
                    selectedTheme = themeTypeList[it]
                }
            }

            selectedTheme.contents.invoke {
                Scaffold(
                    topBar = { TopAppBarProvider.YoutubeTopAppBar() },
                    bottomBar = { BottomBarsProvider.YoutubeBottomBar() }
                ) {
                    Box(modifier = Modifier.padding(it))
                }
            }

            Box(modifier = Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier
                        .width(300.dp)
                        .align(Alignment.Center)
                ) {
                    Row(Modifier.height(height), verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Theme:")
                        VerticalPager(state = themePageState) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                Text(
                                    text = themeTypeList[it].name,
                                    modifier = Modifier.align(Alignment.Center)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun YoutubePreview() {
    ThemeProvider.Youtube {
        Scaffold(
            topBar = { TopAppBarProvider.YoutubeTopAppBar() },
            bottomBar = { BottomBarsProvider.YoutubeBottomBar() }
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                Column(modifier = Modifier.align(Alignment.Center)) {
                    PreviewTextField()
                    Buttons()
                }

                /*Button(onClick = { *//*TODO*//* }) {
                    Text(text = "ABC")
                }*/

//                Card(
//                    modifier = Modifier.size(100.dp)
//                ) {

//                }
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "")
                }
            }
        }
    }
}


@Preview
@Composable
fun PreviewTextField() {
    TextField(
        label = {
            Text(text = "label")
        },
        leadingIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.AutoMirrored.Default.ArrowBack, contentDescription = "")
            }
        },
        trailingIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Clear, contentDescription = "")
            }
        },
        prefix = {
            Text(text = "$")
        },
        suffix = {
            Text(text = "@gmail.com")
        },
        value = "value",
        onValueChange = {}
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun JetCasterPreview() {
    ThemeProvider.JetCaster {
        JetsnackScaffold(topBar = { TopAppBarProvider.YoutubeTopAppBar() },
            bottomBar = { BottomBarsProvider.YoutubeBottomBar() }) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                Column(modifier = Modifier.align(Alignment.Center)) {
                    PreviewTextField()
                    Buttons()
                }

                FloatingActionButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun YellowPreview() {
    ThemeProvider.Yellow {
        JetsnackScaffold(topBar = { TopAppBarProvider.YoutubeTopAppBar() },
            bottomBar = { BottomBarsProvider.YoutubeBottomBar() }) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                Column(modifier = Modifier.align(Alignment.Center)) {
                    PreviewTextField()
                    Buttons()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun PinkPreview() {
    ThemeProvider.Pink {
        JetsnackScaffold(topBar = { TopAppBarProvider.YoutubeTopAppBar() },
            bottomBar = { BottomBarsProvider.YoutubeBottomBar() }) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                Column(modifier = Modifier.align(Alignment.Center)) {
                    PreviewTextField()
                    Buttons()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun TwitterPreview() {
    ThemeProvider.Twitter {
        JetsnackScaffold(topBar = { TopAppBarProvider.YoutubeTopAppBar() },
            bottomBar = { BottomBarsProvider.YoutubeBottomBar() }) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                Column(modifier = Modifier.align(Alignment.Center)) {
                    PreviewTextField()
                    Buttons()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun JetSurveyPreview() {
    ThemeProvider.JetSurvey {
        JetsnackScaffold(topBar = { TopAppBarProvider.YoutubeTopAppBar() },
            bottomBar = { BottomBarsProvider.YoutubeBottomBar() }) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                Column(modifier = Modifier.align(Alignment.Center)) {
                    PreviewTextField()
                    Buttons()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun JetSnackPreview() {
    ThemeProvider.JetSnack {
        JetsnackScaffold(topBar = { TopAppBarProvider.YoutubeTopAppBar() },
            bottomBar = { BottomBarsProvider.YoutubeBottomBar() }) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                Column(modifier = Modifier.align(Alignment.Center)) {
                    PreviewTextField()
                    Buttons()
                }
            }
        }
    }
}