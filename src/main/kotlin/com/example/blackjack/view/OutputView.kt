package com.example.blackjack.view

import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Players

class OutputView {

    companion object {

        fun printFirstDealOutResult(dealer: Dealer, players: Players) {
            println("dealer = $dealer")
            println("players = $players")
        }

    }

}