package com.example.blackjack.domain.gamer

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class PlayerTest {

    @Test
    @Disabled
    @DisplayName("card 를 draw 하면 손패에 카드가 추가된다.")
    internal fun draw() {
        val player = Player("user")
        player.hit()

        val hands = player.open()
    }
}