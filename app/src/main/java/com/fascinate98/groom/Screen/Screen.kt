package com.fascinate98.groom.Screen

sealed class Screen(val route: String){
    object Regist: Screen("regist")
}
