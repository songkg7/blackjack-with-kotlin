package com.example.blackjack.domain.card

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class CardsTest {

    @Test
    @DisplayName("card 덱은 52장으로 구성된다.")
    internal fun initCards() {
        val cards = Cards()

        assertThat(cards.cards).hasSize(52)
    }
}