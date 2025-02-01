package com.example.cryptoapp.ui.navigation

sealed class NavigationRoutes {

        // Authenticated Routes
        sealed class Authenticated(val route: String) : NavigationRoutes() {
            object NavigationRoute : Authenticated(route = "authenticated")
            object Home : Authenticated(route = "Home")
        }

}
