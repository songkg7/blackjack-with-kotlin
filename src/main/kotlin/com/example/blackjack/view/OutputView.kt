package com.example.blackjack.view

import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Player
import com.example.blackjack.domain.gamer.Players

class OutputView {

    companion object {

        fun printFirstDealOutResult(dealer: Dealer, players: Players) {
            printFirstDealOut(dealer, players)
            printDealerFirstDealOutResult(dealer)
            printPlayersFirstDealOutResult(players)
        }

        private fun printFirstDealOut(dealer: Dealer, players: Players) {
            val allNames = players.getAllNames().joinToString { it.getValue() }
            println("${dealer.name.getValue()}와 ${allNames}에게 카드 2장을 분배했습니다.")
        }

        private fun printDealerFirstDealOutResult(dealer: Dealer) {
            println("${dealer.name.getValue()} 카드: ${dealer.cards}")
        }

        private fun printPlayersFirstDealOutResult(players: Players) {
            val playerList = players.getPlayers()
            playerList.forEach { println("${it.name.getValue()} 카드: ${it.cards}") }
        }

    }

}