package br.edu.ifsp.scl.sc3044025.soccerscore.ui.components

fun getWinner(
    teamA: String,
    teamB: String,
    goalsA: Int,
    goalsB: Int
): String {
    return when {
        goalsA > goalsB -> teamA
        goalsB > goalsA -> teamB
        else -> "Exciting draw!"
    }
}