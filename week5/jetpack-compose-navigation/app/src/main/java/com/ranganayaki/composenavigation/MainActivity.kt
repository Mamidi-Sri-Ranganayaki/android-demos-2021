package com.ranganayaki.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.Column
//import androidx.compose.material.Button
//import androidx.compose.material.MaterialTheme
//import androidx.compose.material.Surface
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.navigation.NavController
//import androidx.navigation.NavType
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import androidx.navigation.navArgument
import com.ranganayaki.composenavigation.composables.AppNavHost
//import com.ranganayaki.composenavigation.ui.theme.ComposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            AppNavHost(navController)
        }
    }
}
