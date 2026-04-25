package br.edu.ifsp.scl.sc3044025.soccerscore.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ResultSoccerMatch(
    navHostController: NavHostController,
    modifier: Modifier = Modifier,
    resultMatch: String
) {

    val isDraw = resultMatch == "Exciting draw!"


    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        if (isDraw) {

            Text(
                text = "⚽ Exciting draw!",
                style = MaterialTheme.typography.headlineLarge,
                color = Color(0xFFFFC107)
            )

        } else {

            Text(
                text = "🏆 $resultMatch venceu!",
                style = MaterialTheme.typography.headlineLarge,
                color = Color(0xFF4CAF50)
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                navHostController.navigate("main_screen")
            }
        ) {
            Text("New Game")
        }
    }
}