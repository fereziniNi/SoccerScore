package br.edu.ifsp.scl.sc3044025.soccerscore.ui.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun ResulSoccerMatch(
    navHostController: NavHostController,
    modifier: Modifier = Modifier,
    resultMatch: String,
){
    Text(
        text = resultMatch
    )
}