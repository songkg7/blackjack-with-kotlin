package com.example.blackjack.domain.gamer

import com.example.blackjack.domain.Money
import com.example.blackjack.domain.card.Deck

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
}