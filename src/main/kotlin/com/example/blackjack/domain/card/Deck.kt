package com.example.blackjack.domain.card

class Deck private constructor() {

    constructor(cards: MutableList<Card>) : this()

    companion object {
        fun create(): Deck {
            val cards = mutableListOf<Card>()
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
    }

}