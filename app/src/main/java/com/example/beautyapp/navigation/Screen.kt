package com.example.beautyapp.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Look: Screen("look")
    data object Profile: Screen("profile")
    data object DetailProduct: Screen("detail_product")
}