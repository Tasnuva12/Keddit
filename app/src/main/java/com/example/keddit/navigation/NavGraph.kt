package com.example.keddit.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.keddit.screens.NewsScreen
import com.example.keddit.screens.Screen


@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun NavGraph()
{
    val snackbarHostState=remember{ SnackbarHostState() }
    val navController= rememberNavController()

    val scope = rememberCoroutineScope()
    Scaffold(
        modifier = Modifier.fillMaxSize(),

        // Top bar, similar to Toolbar in old View system
        topBar = {
            TopAppBar(
                title = { Text("Keddit") } // Title inside the top app bar
            )
        },



    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.NewsScreen.route
        ){
            composable(Screen.NewsScreen.route) {
                NewsScreen(
                    navController,
                    modifier = Modifier.padding(innerPadding)

                )
            }
        }
    }
}