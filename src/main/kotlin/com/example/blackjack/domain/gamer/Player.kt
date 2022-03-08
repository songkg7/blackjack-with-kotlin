package com.example.blackjack.domain.gamer

import com.example.blackjack.domain.card.Card
import com.example.blackjack.domain.card.Cards
import java.util.stream.Collector
import java.util.stream.Collectors
import java.util.stream.Stream

class Player(val name: String, private val cards: Cards) : Gamer {

    private var hands: MutableList<Card> = cards.firstDealOut()

    override fun open(): List<Card> {
        return hands
    }

    fun draw() {
        val card = cards.dealOut()
        hands.add(card)
    }
}