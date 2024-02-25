package com.yavin.beeracademy

sealed class Screen(val route: String) {
    data object BeerListScreen : Screen("beer_list")
    data object BeerDetailScreen : Screen("beer_detail")
    data object AboutDeveloperScreen : Screen("beer_details")

    fun withArgs(vararg args: Any): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }

}