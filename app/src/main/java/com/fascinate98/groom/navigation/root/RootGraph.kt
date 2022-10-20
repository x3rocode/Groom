package com.fascinate98.groom.navigation.root

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun RootNavigationGraph(navHostController: NavHostController){
    NavHost(
        navController = navHostController,
        route = Graph.AUTH,
        startDestination = Graph.AUTH
    ){

    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTH = "auth_graph"
    const val MAIN = "main_graph"

}