package com.example.blackjack.domain.card

class Cards(private val cards: List<Card>){

    fun dealOut(): Cards {
        val card = Deck.dealOut()
        return Cards(cards + card)
    }

    fun calcValue(): Int {
        return cards.sumOf { card -> card.getValue() }
    }

    fun isBlackJack(): Boolean {
        return calcValue() == 21
    }

    fun isBust(): Boolean {
        return calcValue() > 21
    }

}