package br.edu.ifsp.scl.sc3044025.soccerscore.ui.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import br.edu.ifsp.scl.sc3044025.soccerscore.ui.routes.Screen


@Composable
fun MainNavegator(navHostController: NavHostController, modifier: Modifier){
    NavHost(
        navController = navHostController,
        startDestination = Screen.Main.route
    ) {
        composable(route = Screen.Main.route) {
            ConfigureSoccerMatch(
                navHostController = navHostController,
                modifier = Modifier
            )
        }

        composable(
            route = Screen.Edit.route +
                    "?soccerTeamA={soccerTeamA}" +
                    "&soccerTeamB={soccerTeamB}" +
                    "&goalsTeamA={goalsTeamA}" +
                    "&goalsTeamB={goalsTeamB}",
            arguments = listOf(
                navArgument("soccerTeamA") {
                    type = NavType.StringType
                },
                navArgument("soccerTeamB") {
                    type = NavType.StringType
                },
                navArgument("goalsTeamA") {
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument("goalsTeamB") {
                    type = NavType.IntType
                    defaultValue = 0
                }
            )
        ) { backStackEntry ->

            EditSoccerMatch(
                navHostController = navHostController,
                modifier = Modifier,
                soccerTeamA = backStackEntry.arguments?.getString("soccerTeamA") ?: "",
                soccerTeamB = backStackEntry.arguments?.getString("soccerTeamB") ?: "",
                goalsTeamA = backStackEntry.arguments?.getInt("goalsTeamA") ?: 0,
                goalsTeamB = backStackEntry.arguments?.getInt("goalsTeamB") ?: 0
            )
        }
    }
}
