package com.example.blackjack.domain.gamer

import com.example.blackjack.domain.Money
import com.example.blackjack.domain.card.Deck
import java.util.Collections
import java.util.stream.Collectors
import java.util.stream.Stream

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

    override fun toString(): String {
        return "Players(players=$players)"
    }

    fun calculateProfit(dealer: Dealer): Map<Player, Money> {
        // 누가 이겼는지 판단해야함
        // Rule 객체가 필요
        val dealerTotal = dealer.cards.getTotalValue()
        val dealerIntMap = mapOf(dealer to dealer.cards.getTotalValue())

        val winner = players
            .filter { !it.key.cards.isBust() }
            .filter { it.key.cards.getTotalValue() > dealerTotal }
            .map { it.key to it.value.multiply(1.5) }
            .toMap()

        return winner
    }
}