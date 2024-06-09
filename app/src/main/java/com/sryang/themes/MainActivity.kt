package com.sryang.themes

import YoutubeBottomBar
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.tooling.preview.Preview
import com.sryang.library.Jetcaster
import com.sryang.library.JetsnackScaffold
import com.sryang.library.Pink
import com.sryang.library.RusticTheme
import com.sryang.library.ThemeProvider
import com.sryang.library.Twitter
import com.sryang.library.Yellow
import com.sryang.library.YoutubeTheme
import com.sryang.topappbar.HomeAppBar
import com.sryang.topappbar.ScaffoldTopAppBar
import com.sryang.topappbar.SurveyTopAppBar
import com.sryang.topappbar.TopAppBar
import com.sryang.topappbar.TopAppBarProvider
import com.sryang.topappbar.YoutubeTopAppBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RusticTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingPreview()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ThemeProvider.YoutubeTheme {
        Scaffold(
            topBar = { TopAppBarProvider.YoutubeTopAppBar() },
            bottomBar = { YoutubeBottomBar() }
        ) {
            Box(modifier = Modifier.padding(it))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview1() {
    ThemeProvider.Jetcaster {
        JetsnackScaffold(topBar = { TopAppBarProvider.YoutubeTopAppBar() },
            bottomBar = { YoutubeBottomBar() }) {

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    ThemeProvider.Yellow {
        JetsnackScaffold(topBar = { TopAppBarProvider.YoutubeTopAppBar() },
            bottomBar = { YoutubeBottomBar() }) {

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    ThemeProvider.Pink {
        JetsnackScaffold(topBar = { TopAppBarProvider.YoutubeTopAppBar() },
            bottomBar = { YoutubeBottomBar() }) {

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    ThemeProvider.Twitter {
        JetsnackScaffold(topBar = { TopAppBarProvider.YoutubeTopAppBar() },
            bottomBar = { YoutubeBottomBar() }) {

        }
    }
}