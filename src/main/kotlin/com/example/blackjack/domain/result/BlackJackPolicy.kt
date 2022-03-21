package com.example.blackjack.domain.result

import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Player
import com.example.blackjack.domain.gamer.Players

class BlackJackPolicy : ResultPolicy {

    override fun judge(dealer: Dealer, player: Player) :Boolean {
        return player.isBlackJack() && !dealer.isBlackJack()
    }

}