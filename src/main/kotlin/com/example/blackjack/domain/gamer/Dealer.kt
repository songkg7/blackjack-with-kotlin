package com.example.blackjack.domain.gamer

import com.example.blackjack.domain.card.Card
import com.example.blackjack.domain.card.Cards

class Dealer(name: String = "딜러") : Gamer(name) {

    companion object {
        fun appoint(): Dealer {
            return Dealer()
        }

    }

}