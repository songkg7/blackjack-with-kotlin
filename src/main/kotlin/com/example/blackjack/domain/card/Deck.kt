package com.example.blackjack.domain.card

class Deck private constructor() {

    companion object {
        private val deck: MutableList<Card> = initCards()

        private fun initCards(): MutableList<Card> {
            val cards = mutableListOf<Card>()
            Symbol.values().forEach { symbol ->
                Denomination.values().forEach { denomination ->
                    cards.add(Card(symbol, denomination))
                }
            }

            cards.shuffle()
            return cards
        }

        fun firstDealOut(): Cards {
            return Cards(listOf(deck.removeFirst(), deck.removeFirst()))
        }

        fun dealOut(): Card {
            return deck.removeFirst()
        }

        fun size(): Int {
            return deck.size
        }
    }

}