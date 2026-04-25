package br.edu.ifsp.scl.sc3044025.soccerscore.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.edu.ifsp.scl.sc3044025.soccerscore.ui.components.getWinner

@Composable
fun EditSoccerMatch(
    navHostController: NavHostController,
    modifier: Modifier = Modifier,
    soccerTeamA: String,
    soccerTeamB: String,
    goalsTeamA: Int,
    goalsTeamB: Int
) {
    var editedA by rememberSaveable { mutableStateOf(soccerTeamA) }
    var editedB by rememberSaveable { mutableStateOf(soccerTeamB) }
    var editedGoalsA by rememberSaveable { mutableStateOf(goalsTeamA) }
    var editedGoalsB by rememberSaveable { mutableStateOf(goalsTeamB) }

    var result by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF121826))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(48.dp))

        Text(
            text = "Edit Match",
            color = Color(0xFF4FC3F7),
            style = MaterialTheme.typography.headlineLarge.copy(
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
            )
        )

        Spacer(modifier = Modifier.height(36.dp))

        Text(
            text = "Team A: $editedA",
            color = Color.White,
            style = MaterialTheme.typography.titleLarge.copy(
                fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold
            )
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Team B: $editedB",
            color = Color.White,
            style = MaterialTheme.typography.titleLarge.copy(
                fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold
            )
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "$editedGoalsA X $editedGoalsB",
            color = Color(0xFF81C784),
            style = MaterialTheme.typography.headlineSmall.copy(
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
            )
        )

        Spacer(modifier = Modifier.height(36.dp))

        Button(
            onClick = {
                navHostController.popBackStack()
            },
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFAF4C4C),
                contentColor = Color.White
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Edit")
        }

        Button(
            onClick = {
                result = getWinner(
                    soccerTeamA,
                    soccerTeamB,
                    goalsTeamA,
                    goalsTeamB
                )
                navHostController.navigate("confirm_screen?resultMatch=$result")

            },
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF5EAF4C),
                contentColor = Color.White
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
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