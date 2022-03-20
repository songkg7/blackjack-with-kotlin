package com.example.blackjack.domain

class Money(val amount: Int) {

    override fun toString(): String {
        return "Money(amount=$amount)"
    }

    fun multiply(ratio: Double): Money {
        return Money((amount * ratio).toInt())
    }
}