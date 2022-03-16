package com.example.blackjack.domain.card

class Cards {

    var cards: List<Card> = emptyList()

    fun add(card: Card) {
        cards = cards + card
    }

    override fun toString(): String {
        return "$cards"
    }

    fun getTotalValue(): Int {
        return cards.sumOf { it.getValue() }
    }

}