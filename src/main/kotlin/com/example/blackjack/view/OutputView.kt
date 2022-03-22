package com.example.blackjack.view

import com.example.blackjack.domain.Money
import com.example.blackjack.domain.result.GameResult
import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Gamer
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

        fun printDealOutResult(gamer: Gamer) {
            println("${gamer.name.getValue()} 카드 총합: ${gamer.calculateScore()}")
        }

        fun printDealerCardsStatus(dealer: Dealer) {
            println("${dealer.name.getValue()}의 카드 value 가 16 이하입니다.")
            println("${dealer.name.getValue()}는 카드의 value 가 16 이하일 경우에는 무조건 카드를 받습니다.")
        }

        fun printTotalResult(result: Map<Gamer, Money>) {
            result.forEach { (gamer, money) ->
                println("${gamer.name.getValue()}님의 총 수익은 ${money.amount} 입니다.")
            }
        }
    }

}