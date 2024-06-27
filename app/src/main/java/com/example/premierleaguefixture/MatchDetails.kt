package com.example.premierleaguefixture

import java.time.LocalDate
import java.util.Date

data class MatchDetails(
    val MatchNumber : Int = 1,
    val RoundNumber : Int = 1,
    val DateUtc: LocalDate = LocalDate.now(),
    val Location : String = "Brentford Community Stadium",
    val HomeTeam : String = "Brentford",
    val AwayTeam : String = "Arsenal",
    val Group : String? = null,
    val HomeTeamScore : Int = 2,
    val AwayTeamScore : Int = 0
)
