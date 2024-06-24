package com.example.jetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jetcompose.ui.theme.JetComposeTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           JetComposeTheme {
               var selected by remember { mutableStateOf(false) }
               var selected2 by remember { mutableStateOf(false) }
               Column (
                   modifier = Modifier.fillMaxSize().padding(80.dp),
                   verticalArrangement = Arrangement.Center,
                   horizontalAlignment = Alignment.CenterHorizontally
               ){
                   SelectableItem(
                       selected = selected ,
                       title = "Lorem Ipsum",
                       onClick = {
                           selected = !selected
                       }
                   )
                   Spacer(modifier = Modifier.height(12.dp))
                   SelectableItem(
                       selected = selected2 ,
                       title = "Lorem Ipsum",
                       subTitle = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. ",
                       onClick = {
                           selected2 = !selected2
                       }
                   )
               }
           }
        }
    }
}
