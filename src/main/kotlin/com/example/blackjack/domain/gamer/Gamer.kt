package com.example.blackjack.domain.gamer

import com.example.blackjack.domain.card.Card
import com.example.blackjack.domain.card.Cards

abstract class Gamer(name: String) {

    val cards: Cards = Cards()
    val name: Name = Name(name)

    fun draw(card: Card) {
        cards.add(card)
    }

    override fun toString(): String {
        return "Gamer(cards=$cards, name=$name)"
    }

    abstract fun isAvailableDealOut(): Boolean

    fun isBlackJack(): Boolean {
        return cards.isBlackJack()
    }

    fun isBust(): Boolean {
        return cards.isBust()
    }

    fun calculateScore(): Int {
        return cards.getTotalValue()
    }
}