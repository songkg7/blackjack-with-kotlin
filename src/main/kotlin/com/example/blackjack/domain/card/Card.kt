package com.example.blackjack.domain.card

class Card(private val symbol: Symbol, private val denomination: Denomination) {
    override fun toString(): String {
        return "(symbol: $symbol, value: $denomination)"
    }

    fun getValue(): Int {
        return denomination.value
    }
}