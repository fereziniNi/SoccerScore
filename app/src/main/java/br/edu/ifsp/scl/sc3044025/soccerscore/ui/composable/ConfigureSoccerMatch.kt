package br.edu.ifsp.scl.sc3044025.soccerscore.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import br.edu.ifsp.scl.sc3044025.soccerscore.ui.theme.SoccerScoreTheme


@Composable
fun ConfigureSoccerMatch(modifier: Modifier){
    var soccerTeamA by rememberSaveable { mutableStateOf("") }
    var soccerTeamB by rememberSaveable { mutableStateOf("") }

    var goalsTeamA by rememberSaveable { mutableStateOf("") }
    var goalsTeamB by rememberSaveable { mutableStateOf("") }


    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(48.dp))

        Text(
            text = "Soccer Match"
        )

        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedTextField(
            value = soccerTeamA,
            onValueChange = { soccerTeamA = it },
            label = { Text("Soccer team name A") }
        )

        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedTextField(
            value = soccerTeamB,
            onValueChange = { soccerTeamB = it },
            label = { Text("Soccer team name B") }
        )

        Spacer(modifier = Modifier.padding(20.dp))
        OutlinedTextField(
            value = goalsTeamA,
            onValueChange = { goalsTeamA = it },
            label = { Text("Soccer team goals A") }
        )

        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedTextField(
            value = goalsTeamB,
            onValueChange = { goalsTeamB = it },
            label = { Text("Soccer team goals B") }
        )

        Spacer(modifier = Modifier.padding(12.dp))
        Button(
            onClick = {
                // ação do botão
            }
        ) {
            Text("Save Match Result")
        }

    }
}


@Preview(showBackground = true,
    uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ConfigureSoccerMatchPreview() {
    SoccerScoreTheme {
        ConfigureSoccerMatch(modifier = Modifier)
    }
}