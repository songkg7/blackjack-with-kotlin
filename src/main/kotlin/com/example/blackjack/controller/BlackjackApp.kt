package com.example.blackjack.controller

import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Player
import com.example.blackjack.view.InputView
import com.example.blackjack.view.OutputView

class BlackjackApp(private val inputView: InputView, private val outputView: OutputView) {

    fun run() {
        val gamersName = inputView.inputGamersName()
        gamersName.forEach { println("name = $it") }

        val dealer = Dealer(gamersName[0])
        val player = Player(gamersName[1])

        // 현재 겜블러들의 손패를 공개하고 카드를 더 뽑을 것인지를 선택
        val answer = inputView.dealOutSelectMessage(player)
        if (answer.lowercase() == "y") {
            player.hit()
        }
        if (answer.lowercase() == "n") {
            TODO("game stop")
        }


    }

}