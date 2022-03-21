package com.example.blackjack.domain.gamer

class Player(name: String) : Gamer(name) {

    override fun isAvailableDealOut(): Boolean {
        return cards.getTotalValue() < 21
    }
}
