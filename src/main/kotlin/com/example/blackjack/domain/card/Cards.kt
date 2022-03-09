package com.example.blackjack.domain.card

class Cards(private val cards: List<Card>){

    fun dealOut(): Cards {
        val card = Deck.dealOut()
        return Cards(cards + card)
    }

    fun show() {
        cards.forEach { println(it.toString()) }
        val sum = cards.sumOf { card -> card.getValue() }
        println("현재 점수: $sum")
    }

}