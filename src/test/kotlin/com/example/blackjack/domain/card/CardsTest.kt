package com.example.blackjack.domain.card

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class CardsTest {

    @Test
    @DisplayName("card 덱은 52장으로 구성된다.")
    internal fun initCards() {
        val cards = Cards()

        assertThat(cards.size()).isEqualTo(52)
    }

    @Test
    @DisplayName("처음 카드는 2장씩 가져간다.")
    internal fun firstDealOut() {
        val cards = Cards()

        val firstDealOut = cards.firstDealOut()

        println("firstDealOut = $firstDealOut")

        assertThat(firstDealOut).hasSize(2)
        assertThat(cards.size()).isEqualTo(50)
    }
}