package com.example.blackjack.domain.card

class Cards {

    private val cards: MutableList<Card> = generateCards()

    private fun generateCards(): MutableList<Card> {
        val cards = mutableListOf<Card>()
        Symbol.values().forEach { type ->
            Type.values().forEach { symbol ->
                cards.add(Card(type, symbol))
            }
        }

        cards.shuffle()
        return cards
    }

    fun firstDealOut(): List<Card> {
        return listOf(cards.removeFirst(), cards.removeFirst())
    }

    fun size(): Int {
        return cards.size
    }

    fun dealOut(): Card {
        return cards.removeFirst()
    }

}