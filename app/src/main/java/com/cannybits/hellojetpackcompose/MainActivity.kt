package com.cannybits.hellojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.cannybits.hellojetpackcompose.ui.theme.HelloJetpackComposeTheme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Greeting("Cannyville")
                    GreetingCardWithTexts(message = "Happy Birthday Nyandago", from = "Paul")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = Color.Magenta) {
        Text(text = "Hello $name!", modifier = Modifier.padding(24.dp))
    }
}

@Composable
fun GreetingCardWithTexts(message: String, from: String){
    Column{
        Text(text = message, fontSize = 30.sp)
        Text(text = from, fontSize = 24.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloJetpackComposeTheme {
        GreetingCardWithTexts(message = "Kengee wewe", from = "Paul" )
    }
}