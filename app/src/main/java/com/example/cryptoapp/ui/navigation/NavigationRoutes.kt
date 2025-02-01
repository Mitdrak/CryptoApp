package com.example.cryptoapp.ui.navigation

sealed class NavigationRoutes {

        // Authenticated Routes
        sealed class Authenticated(val route: String) : NavigationRoutes() {
            data object NavigationRoute : Authenticated(route = "authenticated")
            data object Home : Authenticated(route = "Home")
        }

}
