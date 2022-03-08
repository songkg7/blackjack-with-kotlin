package com.example.blackjack.domain.gamer

import com.example.blackjack.domain.card.Card
import com.example.blackjack.domain.card.Cards

class Dealer(val name: String, val cards: Cards) : Gamer {

    override fun open(): List<Card> {
        TODO("Not yet implemented")
    }
}