package com.example.blackjack.domain.card

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class DeckTest {

    @Test
    @DisplayName("Deck 은 52장으로 구성된다.")
    internal fun initCards() {

        assertThat(Deck.size()).isEqualTo(52)
    }

}