package com.example.blackjack.controller

import com.example.blackjack.domain.card.Deck
import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Players

class BlackjackGame private constructor() {
    lateinit var deck: Deck

    fun firstDealOut(dealer: Dealer, players: Players) {
        for (i: Int in 1..2) {
            dealer.draw(Deck.dealOut())
            players.draw()
        }
    }

    private constructor(deck: Deck) : this()

    companion object {
        fun newInstance(deck: Deck): BlackjackGame {
            return BlackjackGame(deck)
        }
    }

}