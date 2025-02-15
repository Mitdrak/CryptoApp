package com.example.cryptosocket.ui.navigation

sealed class NavigationRoutes {

        // Authenticated Routes
        sealed class Authenticated(val route: String) : NavigationRoutes() {
            data object NavigationRoute : Authenticated(route = "authenticated")
            data object Home : Authenticated(route = "Home")
        }
        // Unauthenticated Routes
        sealed class Unauthenticated(val route: String) : NavigationRoutes() {
            data object NavigationRoute : Unauthenticated(route = "unauthenticated")
            data object Login : Unauthenticated(route = "Login")
        }

}
