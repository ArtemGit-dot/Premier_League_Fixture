package com.example.premierleaguefixture

import java.time.LocalDate
import java.util.Date

data class MatchDetails(
    val matchNumber : Int = 1,
    val roundNumber : Int = 1,
    val dateUtc: LocalDate = LocalDate.now(),
    val location : String = "Brentford Community Stadium",
    val homeTeam : String = "Brentford",
    val awayTeam : String = "Arsenal",
    val group : String? = null,
    val homeTeamScore : Int = 2,
    val awayTeamScore : Int = 0
)
