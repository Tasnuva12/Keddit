package com.example.keddit.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.foundation.lazy.items

@Composable
fun NewsScreen(navController: NavHostController, modifier: Modifier=Modifier,){
    val newsItems=listOf(
        "Kotlin Compose is awesome!",
        "Compose makes UIs easier!",
        "You’re doing great!"
    )
    Box(
        modifier=modifier.fillMaxSize()
    ){
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy (8.dp)
        ){
            items(newsItems){
                    item-> Text(text=item)
            }
        }
    }
}