package com.fascinate98.groom.navigation.auth

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.Navigation
import androidx.navigation.navigation
import com.fascinate98.groom.navigation.root.Graph

fun NavGraphBuilder.authNavGraph(navController: NavController){
    navigation(
        route = Graph.AUTH,
        startDestination = "SIGN_Up"
    ){

    }
}