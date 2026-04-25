package br.edu.ifsp.scl.sc3044025.soccerscore.ui.components

fun isValidMatch(
    teamA: String,
    teamB: String,
    goalsA: String,
    goalsB: String
): Boolean {
    val teamsValid = teamA.isNotBlank() && teamB.isNotBlank()

    val goalsValid = goalsA.toIntOrNull() != null &&
            goalsB.toIntOrNull() != null

    return teamsValid && goalsValid
}