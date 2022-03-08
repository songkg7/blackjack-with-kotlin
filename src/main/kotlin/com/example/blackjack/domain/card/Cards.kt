package com.example.blackjack.domain.card

class Cards {

    private val cards: MutableList<Card> = initCards()

    private fun initCards(): MutableList<Card> {
        val cards = mutableListOf<Card>()
        Symbol.values().forEach { type ->
            Type.values().forEach { symbol ->
                cards.add(Card(type, symbol))
            }
        }

        cards.shuffle()
        return cards
    }

    fun firstDealOut(): MutableList<Card> {
        return mutableListOf(cards.removeFirst(), cards.removeFirst())
    }

    fun size(): Int {
        return cards.size
    }

    fun dealOut(): Card {
        return cards.removeFirst()
    }

}