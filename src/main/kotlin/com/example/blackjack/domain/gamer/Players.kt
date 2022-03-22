package com.example.blackjack.domain.gamer

import com.example.blackjack.domain.Money
import com.example.blackjack.domain.card.Deck
import com.example.blackjack.domain.result.GameResult

class Players(players: Map<String, Money>) {

    private val players: Map<Player, Money> = players.mapKeys { Player(it.key) }

    fun draw() {
        players.forEach { (player, _) -> player.draw(Deck.dealOut()) }
    }

    fun getAllNames(): List<Name> {
        return players.keys.map { it.name }
    }

    fun getPlayers(): List<Player> {
        return players.keys.toList()
    }

    private fun bettingMoney(): Money {
        val sum = players.map { it.value.amount }.sum()
        return Money(sum)
    }

    fun calculateProfit(dealer: Dealer): Map<Gamer, Money> {
        val resultMap = mutableMapOf<Gamer, Money>()
        for (player in players.keys) {
            val gameResult = GameResult.judge(dealer, player)
            val profit = gameResult.profit(players.getValue(player))
            resultMap[player] = profit
        }

        val sum = resultMap.values.filter { it.amount > 0 }.sumOf { it.amount }
        resultMap[dealer] = bettingMoney().minus(Money(sum))

        return resultMap
    }
}