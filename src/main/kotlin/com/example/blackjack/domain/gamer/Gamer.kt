package com.example.blackjack.domain.gamer

import com.example.blackjack.domain.card.Card
import com.example.blackjack.domain.card.Cards

abstract class Gamer(name: String) {

    private val cards: Cards = Cards()
    val name: Name = Name(name)

    fun draw(card: Card) {
        cards.add(card)
    }

}