package br.edu.ifsp.scl.sc3044025.soccerscore.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.navigation.compose.rememberNavController
import br.edu.ifsp.scl.sc3044025.soccerscore.ui.components.isValidMatch
import br.edu.ifsp.scl.sc3044025.soccerscore.ui.theme.SoccerScoreTheme


@Composable
fun ConfigureSoccerMatch(navHostController: NavHostController, modifier: Modifier){
    var soccerTeamA by rememberSaveable { mutableStateOf("") }
    var soccerTeamB by rememberSaveable { mutableStateOf("") }

    var goalsTeamA by rememberSaveable { mutableStateOf("") }
    var goalsTeamB by rememberSaveable { mutableStateOf("") }

    var showError by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(48.dp))

        Text(
            text = "Soccer Match",
            style = androidx.compose.material3.MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedTextField(
            value = soccerTeamA,
            onValueChange = { soccerTeamA = it },
            label = { Text("Soccer team name A") },
            singleLine = true,
            shape = androidx.compose.foundation.shape.RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedTextField(
            value = soccerTeamB,
            onValueChange = { soccerTeamB = it },
            label = { Text("Soccer team name B") },
            singleLine = true,
            shape = androidx.compose.foundation.shape.RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.padding(20.dp))
        OutlinedTextField(
            value = goalsTeamA,
            onValueChange = { goalsTeamA = it },
            label = { Text("Soccer team goals A") },
            singleLine = true,
            shape = androidx.compose.foundation.shape.RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedTextField(
            value = goalsTeamB,
            onValueChange = { goalsTeamB = it },
            label = { Text("Soccer team goals B") },
            singleLine = true,
            shape = androidx.compose.foundation.shape.RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        )

        if (showError) {
            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Please enter valid data!",
                color = androidx.compose.ui.graphics.Color.Red,
                style = androidx.compose.material3.MaterialTheme.typography.bodyMedium
            )
        }

        Spacer(modifier = Modifier.padding(12.dp))
        Button(
            onClick = {
                if (isValidMatch(soccerTeamA, soccerTeamB, goalsTeamA, goalsTeamB)) {
                    navHostController.navigate("edit_screen?soccerTeamA=$soccerTeamA&soccerTeamB=$soccerTeamB&goalsTeamA=$goalsTeamA&goalsTeamB=$goalsTeamB")
                } else {
                    showError = true
                }
            },
            shape = androidx.compose.foundation.shape.RoundedCornerShape(12.dp)
        ) {
            Text("Save Match Result",
                style = androidx.compose.material3.MaterialTheme.typography.titleMedium)

        }

    }
}


@Preview(showBackground = true,
    uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ConfigureSoccerMatchPreview() {
    SoccerScoreTheme {
        ConfigureSoccerMatch(
            navHostController = rememberNavController(),
            modifier = Modifier
        )
    }
}