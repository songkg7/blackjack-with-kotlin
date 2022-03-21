package com.example.blackjack.domain.result

import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Player

class DrawPolicy : ResultPolicy {

    override fun judge(dealer: Dealer, player: Player): Boolean {
        return (!player.isBust() && (player.calculateScore() == dealer.calculateScore()))
                || (player.isBlackJack() && dealer.isBlackJack())
    }
}