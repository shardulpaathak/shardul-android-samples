package com.example.roughcomposesamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.roughcomposesamples.ui.theme.RoughComposeSamplesTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoughComposeSamplesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginCard("First Name", "Last Name")
                }
            }
        }
    }
}

@Composable
fun LoginCard(firstName: String, lastName: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = firstName,
            textAlign = TextAlign.Center,
            modifier = modifier.width(100.dp), fontStyle = FontStyle.Italic
        )
        Spacer(modifier = modifier.height(5.dp))

        Text(
            text = lastName,
            modifier = modifier.width(100.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = modifier.height(5.dp))
        ElevatedButton(onClick = { /*TODO*/ }, modifier = modifier.width(100.dp)) {
            modifier.size(20.dp)
            Text(text = "Login")
        }

    }

}

@Preview(showBackground = true)
@Composable
fun LoginCardPreview() {
    RoughComposeSamplesTheme {
        LoginCard("Android", "")
    }
}