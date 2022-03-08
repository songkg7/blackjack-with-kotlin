package com.example.blackjack.domain.card

class Card(private val symbol: Symbol, private val type: Type) {
    override fun toString(): String {
        return "Card(symbol=$symbol, type=$type)"
    }
}