package com.example.blackjack.domain.gamer

import com.example.blackjack.domain.card.Card
import com.example.blackjack.domain.card.Cards
import com.example.blackjack.domain.card.Deck

class Player(val name: String) : Gamer {

    var cards: Cards = Deck.firstDealOut()

    override fun open() {
        println("$name 님의 카드를 전개합니다.")
        cards.show()
    }

    fun hit() {
        cards = cards.dealOut()
    }

}