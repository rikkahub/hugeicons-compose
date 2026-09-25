package me.rerere.hugeicons_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons
import me.rerere.hugeicons.stroke.ArrowLeft01
import me.rerere.hugeicons.stroke.ArrowRight01
import me.rerere.hugeicons.stroke.ArrowUp01
import me.rerere.hugeicons.stroke.CallMinus
import me.rerere.hugeicons.stroke.FastForward
import me.rerere.hugeicons.stroke.Internet
import me.rerere.hugeicons.stroke.LeftToRightListBullet
import me.rerere.hugeicons.stroke.Logout01
import me.rerere.hugeicons.stroke.Redo
import me.rerere.hugeicons.stroke.Reply
import me.rerere.hugeicons.stroke.Search01
import me.rerere.hugeicons.stroke.Searching
import me.rerere.hugeicons.stroke.Send
import me.rerere.hugeicons.stroke.TextIndentMore
import me.rerere.hugeicons.stroke.Undo
import me.rerere.hugeicons_compose.ui.theme.HugeiconscomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HugeiconscomposeTheme {
                MainScreen(onBack = ::finish)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(onBack: () -> Unit) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { Text("HugeIcons") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(HugeIcons.ArrowLeft01, contentDescription = "Back")
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(HugeIcons.Search01, contentDescription = "Search")
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Greeting(
                name = "Android",
                modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp)
            )
            DirectionalIcons()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        Icon(HugeIcons.Internet, null)
        Icon(HugeIcons.CallMinus, null)
        Icon(HugeIcons.Searching, null)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HugeiconscomposeTheme {
        Greeting("Android")
    }
}

@Composable
fun DirectionalIcons(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Mirrored in RTL")
        IconRow(
            HugeIcons.ArrowLeft01,
            HugeIcons.ArrowRight01,
            HugeIcons.Undo,
            HugeIcons.Redo,
            HugeIcons.Reply,
            HugeIcons.Send,
            HugeIcons.Logout01,
            HugeIcons.TextIndentMore,
        )
        Text("Not mirrored")
        IconRow(
            HugeIcons.ArrowUp01,
            HugeIcons.FastForward,
            HugeIcons.LeftToRightListBullet,
        )
    }
}

@Composable
private fun IconRow(vararg icons: ImageVector) {
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        icons.forEach { icon -> Icon(icon, icon.name) }
    }
}

@Preview(name = "LTR", showBackground = true)
@Composable
fun MainScreenLtrPreview() {
    HugeiconscomposeTheme {
        MainScreen(onBack = {})
    }
}

@Preview(name = "RTL", showBackground = true)
@Composable
fun MainScreenRtlPreview() {
    HugeiconscomposeTheme {
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            MainScreen(onBack = {})
        }
    }
}
