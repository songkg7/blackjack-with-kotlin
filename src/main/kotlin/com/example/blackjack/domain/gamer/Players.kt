package com.example.blackjack.domain.gamer

import com.example.blackjack.domain.Money
import com.example.blackjack.domain.card.Deck

class Players(players: Map<String, Money>) {

    private val players: Map<Player, Money> = players.mapKeys { Player(it.key) }

    fun draw() {
        players.forEach { (player, _) -> player.draw(Deck.dealOut()) }
    }

    override fun toString(): String {
        return "Players(players=${players.forEach { (player, money) -> println("${player.name}, $money") }})"
    }

}