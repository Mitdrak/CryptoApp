package com.example.cryptoapp.ui.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.cryptoapp.ui.screen.authenticated.home.HomeScreen
import com.example.cryptoapp.ui.screen.unauthenticated.login.LoginScreen

fun NavGraphBuilder.authenticatedGraph(navController: NavController) {
    navigation(
        route = NavigationRoutes.Authenticated.NavigationRoute.route,
        startDestination = NavigationRoutes.Authenticated.Home.route,
    ) {
        //Menu

        composable(route = NavigationRoutes.Authenticated.Home.route) {
            HomeScreen(onNavigateToLogin = {
                navController.navigate(NavigationRoutes.Unauthenticated.Login.route) {
                    popUpTo(route = NavigationRoutes.Authenticated.NavigationRoute.route) {
                        inclusive = true
                    }
                }
            })
        }
    }

}


fun NavGraphBuilder.unauthenticatedGraph(navController: NavController) {
    navigation(
        route = NavigationRoutes.Unauthenticated.NavigationRoute.route,
        startDestination = NavigationRoutes.Unauthenticated.Login.route
    ) {
        //Menu
        composable(route = NavigationRoutes.Unauthenticated.Login.route, enterTransition = {
            return@composable slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.End, tween(700)
            )
        },
            exitTransition = {
                return@composable slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Start, tween(700)
                )
            },
            popEnterTransition = {
                return@composable slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Start, tween(700)
                )
            },
        ) {
            LoginScreen(onNavigateToHome = {
                navController.navigate(NavigationRoutes.Authenticated.Home.route) {
                    popUpTo(route = NavigationRoutes.Unauthenticated.NavigationRoute.route) {
                        inclusive = true
                    }
                }
            })
        }
    }
}