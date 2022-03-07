package com.example.blackjack.domain.card

class Cards {

    val cards: List<Card> = generateCards()

    private fun generateCards(): List<Card> {
        val cards = mutableListOf<Card>()
        Type.values().forEach { type ->
            Symbol.values().forEach { symbol ->
                cards.add(Card(type, symbol))
            }
        }

        return cards.shuffled()
    }

}