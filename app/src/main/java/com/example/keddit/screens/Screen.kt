package com.example.keddit.screens

import kotlinx.serialization.Serializable


sealed class Screen {
    @Serializable
    data object NewsScreen:Screen(){
         val route  = "news_screen"
    }


}