package com.example.blackjack.domain.result

import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Player

class LosePolicy : ResultPolicy {

    override fun judge(dealer: Dealer, player: Player): Boolean {
        return (dealer.calculateScore() > player.calculateScore()) || player.isBust()
                || (!player.isBlackJack() && dealer.isBlackJack())
    }
}