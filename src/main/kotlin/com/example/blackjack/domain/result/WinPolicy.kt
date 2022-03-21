package com.example.blackjack.domain.result

import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Player

class WinPolicy : ResultPolicy {

    override fun judge(dealer: Dealer, player: Player): Boolean {
        return player.calculateScore() > dealer.calculateScore()
    }
}