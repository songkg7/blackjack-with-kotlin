package com.example.blackjack.domain.gamer

import com.example.blackjack.domain.card.Cards
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class PlayerTest {

    @Test
    @DisplayName("card 를 draw 하면 손패에 카드가 추가된다.")
    internal fun draw() {
        val player = Player("user")
        player.draw()

        val hands = player.open()
        println("hands = ${hands.show()}")

        assertThat(hands.show()).hasSize(3)
    }
}