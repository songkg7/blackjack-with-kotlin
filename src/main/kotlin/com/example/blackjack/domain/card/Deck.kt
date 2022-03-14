package com.example.blackjack.domain.card

class Deck private constructor() {

    constructor(cards: MutableList<Card>) : this()

    companion object {
        private val cards = mutableListOf<Card>()
        fun create(): Deck {
            createDeck(cards)

            cards.shuffle()
            return Deck(cards)
        }
        private fun createDeck(cards: MutableList<Card>) {
            Symbol.values().forEach { symbol ->
                createCard(cards, symbol)
            }
        }

        private fun createCard(
            cards: MutableList<Card>,
            symbol: Symbol
        ) {
            Denomination.values().forEach { denomination ->
                cards.add(Card(symbol, denomination))
            }
        }

        fun dealOut(): Card {
            return cards.removeFirst()
        }
    }

}