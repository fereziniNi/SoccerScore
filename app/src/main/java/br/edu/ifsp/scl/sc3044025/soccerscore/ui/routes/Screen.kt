package br.edu.ifsp.scl.sc3044025.soccerscore.ui.routes

sealed class Screen(val route: String) {
    object Main: Screen("main_screen")
    object Edit: Screen("edit_screen")
    object Confirm: Screen("confirm_screen")
}