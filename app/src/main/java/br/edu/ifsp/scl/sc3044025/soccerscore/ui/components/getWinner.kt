package br.edu.ifsp.scl.sc3044025.soccerscore.ui.components

fun getWinner(
    teamA: String,
    teamB: String,
    goalsA: String,
    goalsB: String
): String {
    return when {
        goalsA > goalsB -> teamA
        goalsB > goalsA -> teamB
        else -> "Exciting draw!"
    }
}