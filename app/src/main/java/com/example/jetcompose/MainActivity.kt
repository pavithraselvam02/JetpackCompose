package com.example.jetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jetcompose.ui.theme.JetComposeTheme


class MainActivity : ComponentActivity() {

    lateinit var navcontroller: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           JetComposeTheme {
                navcontroller = rememberNavController()
               SetupNavGraph(navController = navcontroller)
           }
        }
    }
}
