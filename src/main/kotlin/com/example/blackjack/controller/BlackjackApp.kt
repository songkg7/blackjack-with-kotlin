package com.example.blackjack.controller

import com.example.blackjack.domain.card.Cards
import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Player
import com.example.blackjack.domain.view.InputView
import com.example.blackjack.domain.view.OutputView

class BlackjackApp(private val inputView: InputView, private val outputView: OutputView) {

    fun run() {
        val gamersName = inputView.inputGamersName()
        gamersName.forEach { println("name = $it") }

        val cards = Cards()

        val dealer = Dealer(gamersName[0])
        val player = Player(gamersName[1], cards)



    }

}