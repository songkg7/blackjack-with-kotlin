package com.example.blackjack.domain.gamer

class Dealer(name: String = "딜러") : Gamer(name) {

    companion object {
        fun appoint(): Dealer {
            return Dealer()
        }

    }

    override fun isAvailableDealOut(): Boolean {
        return cards.getTotalValue() <= 16
    }
}