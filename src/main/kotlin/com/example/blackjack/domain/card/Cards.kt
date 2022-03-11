package com.example.blackjack.domain.card

class Cards(private val cards: List<Card>){

    fun dealOut(): Cards {
        val card = Deck.dealOut()
        return Cards(cards + card)
    }

    fun calcPoint(): Int {
        return cards.sumOf { card -> card.getValue() }
    }

}