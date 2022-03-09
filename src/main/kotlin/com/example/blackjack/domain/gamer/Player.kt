package com.example.blackjack.domain.gamer

import com.example.blackjack.domain.card.Cards
import com.example.blackjack.domain.card.Deck

class Player(val name: String) : Gamer {

    var cards: Cards = Deck.firstDealOut()

    override fun open(): Cards {
        return cards
    }

    fun draw() {
        cards = cards.dealOut()
    }

}