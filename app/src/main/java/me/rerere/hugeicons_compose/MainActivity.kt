package me.rerere.hugeicons_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import me.rerere.hugeicons.HugeIcons
import me.rerere.hugeicons.stroke.CallMinus
import me.rerere.hugeicons.stroke.Earth
import me.rerere.hugeicons.stroke.Searching
import me.rerere.hugeicons_compose.ui.theme.HugeiconscomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HugeiconscomposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        Icon(HugeIcons.Earth, null)
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