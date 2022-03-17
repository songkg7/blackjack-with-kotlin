package com.example.blackjack.domain

import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Gamer
import com.example.blackjack.domain.gamer.Player
import com.example.blackjack.domain.gamer.Players
import java.util.stream.Stream

class GameResult(dealer: Dealer, players: Players) {

    val gamersPoint = createGamerPoints(dealer, players)
    val gamersProfit = players.calculateProfit(dealer)

    private fun createGamerPoints(dealer: Dealer, players: Players): Map<Gamer, Int> {
        val gamers = listOf(dealer, *players.getPlayers().toTypedArray())
        return gamers.associateWith { it.cards.getTotalValue() }
    }

}