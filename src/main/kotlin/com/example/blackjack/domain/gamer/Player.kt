package com.example.blackjack.domain.gamer

import com.example.blackjack.domain.card.Cards
import com.example.blackjack.domain.card.Deck

class Player(name: String) : Gamer(name) {

    override fun isAvailableDealOut(): Boolean {
        return cards.getTotalValue() < 21
    }
}
