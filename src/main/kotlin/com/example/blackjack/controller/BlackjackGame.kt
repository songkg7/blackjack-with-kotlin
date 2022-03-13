package com.example.blackjack.controller

import com.example.blackjack.domain.card.Deck

class BlackjackGame private constructor() {

    lateinit var deck: Deck

    private constructor(deck: Deck) : this()

    companion object {
        fun newInstance(deck: Deck): BlackjackGame {
            return BlackjackGame(deck)
        }
    }

}