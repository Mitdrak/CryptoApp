package com.example.cryptoapp.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.cryptoapp.ui.screen.authenticated.home.HomeScreen
import com.example.cryptoapp.ui.screen.unauthenticated.login.LoginScreen

fun NavGraphBuilder.authenticatedGraph(navController: NavController) {
    navigation(
        route = NavigationRoutes.Authenticated.NavigationRoute.route,
        startDestination = NavigationRoutes.Authenticated.Home.route
    ) {
        //Menu
        composable(route = NavigationRoutes.Authenticated.Home.route) {
            HomeScreen(navController = navController)
        }
    }

}
fun NavGraphBuilder.unauthenticatedGraph(navController: NavController) {
    navigation(
        route = NavigationRoutes.Unauthenticated.NavigationRoute.route,
        startDestination = NavigationRoutes.Unauthenticated.Login.route
    ) {
        //Menu
        composable(route = NavigationRoutes.Unauthenticated.Login.route) {
            LoginScreen(navController = navController)
        }
    }
}