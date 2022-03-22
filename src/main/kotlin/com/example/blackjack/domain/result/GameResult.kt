package com.example.blackjack.domain.result

import com.example.blackjack.domain.Money
import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Gamer
import com.example.blackjack.domain.gamer.Player
import com.example.blackjack.domain.gamer.Players

enum class GameResult(private val ratio: Double, val resultPolicy: ResultPolicy) {

    BLACKJACK(2.5, BlackJackPolicy()),
    WIN(2.0, WinPolicy()),
    DRAW(0.0, DrawPolicy()),
    LOSE(-1.0, LosePolicy());

    private fun createGamerPoints(dealer: Dealer, players: Players): Map<Gamer, Int> {
        val gamers = listOf(dealer, *players.getPlayers().toTypedArray())
        return gamers.associateWith { it.calculateScore() }
    }

    companion object {
        fun judge(dealer: Dealer, player: Player): GameResult {
            return values().first { it.resultPolicy.judge(dealer, player) }
        }
    }

    fun profit(money: Money): Money {
        return money.multiply(ratio)
    }
}