package br.edu.ifsp.scl.sc3044025.soccerscore.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun EditSoccerMatch(
    navHostController: NavHostController,
    modifier: Modifier = Modifier,
    soccerTeamA: String,
    soccerTeamB: String,
    goalsTeamA: Int,
    goalsTeamB: Int
) {
    var teamA by rememberSaveable { mutableStateOf(soccerTeamA) }
    var teamB by rememberSaveable { mutableStateOf(soccerTeamB) }

    var scoreA by rememberSaveable { mutableStateOf(goalsTeamA.toString()) }
    var scoreB by rememberSaveable { mutableStateOf(goalsTeamB.toString()) }

    Column(modifier = modifier.padding(16.dp)) {

        Text("Editar partida")

        OutlinedTextField(
            value = teamA,
            onValueChange = { teamA = it },
            label = { Text("Team A") }
        )

        OutlinedTextField(
            value = teamB,
            onValueChange = { teamB = it },
            label = { Text("Team B") }
        )

        OutlinedTextField(
            value = scoreA,
            onValueChange = { scoreA = it },
            label = { Text("Goals Team A") }
        )

        OutlinedTextField(
            value = scoreB,
            onValueChange = { scoreB = it },
            label = { Text("Goals Team B") }
        )

        Button(onClick = {
            navHostController.popBackStack()
        }) {
            Text("Save")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EditSoccerMatchPreview() {
    EditSoccerMatch(
        navHostController = NavHostController(androidx.compose.ui.platform.LocalContext.current),
        soccerTeamA = "Flamengo",
        soccerTeamB = "Palmeiras",
        goalsTeamA = 2,
        goalsTeamB = 1
    )
}