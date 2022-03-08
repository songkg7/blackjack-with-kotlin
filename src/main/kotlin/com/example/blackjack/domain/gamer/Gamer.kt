package com.example.blackjack.domain.gamer

import com.example.blackjack.domain.card.Card

sealed interface Gamer {
    fun open(): List<Card>
}