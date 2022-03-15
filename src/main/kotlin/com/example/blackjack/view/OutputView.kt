package com.example.blackjack.view

import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Players

class OutputView {

    companion object {

        fun printFirstDealOutResult(dealer: Dealer, players: Players) {
            printFirstDealOut(dealer, players)
        }

        private fun printFirstDealOut(dealer: Dealer, players: Players) {
            val allNames = players.getAllNames().joinToString { it.getValue() }
            println("${dealer.name.getValue()}와 ${allNames}에게 카드 2장을 분배했습니다.")
        }

    }

}