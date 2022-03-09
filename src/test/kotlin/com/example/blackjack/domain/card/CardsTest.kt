package com.example.blackjack.domain.card

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class CardsTest {

    @Test
    @DisplayName("dealOut 을 하면 손패에 카드가 한 장 추가된다.")
    internal fun dealOut() {
        // TODO: cards 를 deck 에서 생성해주는 것이 맞는가? 직접 생성되야 하지 않을까?
        val cards = Deck.firstDealOut()
        val afterDealOut = cards.dealOut()

        assertThat(afterDealOut).isNotEqualTo(cards)
        assertThat(afterDealOut.show()).hasSize(cards.show().size + 1)
    }
}