package com.example.blackjack.domain.result

import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Player
import com.example.blackjack.domain.gamer.Players

interface ResultPolicy {

    fun judge(dealer: Dealer, player: Player): Boolean

}