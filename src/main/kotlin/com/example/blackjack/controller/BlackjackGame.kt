package com.example.blackjack.controller

import com.example.blackjack.domain.card.Deck
import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Gamer
import com.example.blackjack.domain.gamer.Players
import com.example.blackjack.view.InputView
import com.example.blackjack.view.OutputView

private const val YES = "y"
private const val NO = "n"

class BlackjackGame private constructor() {
    lateinit var deck: Deck

    private constructor(deck: Deck) : this()

    companion object {
        fun newInstance(deck: Deck): BlackjackGame {
            return BlackjackGame(deck)
        }
    }

    fun firstDealOut(dealer: Dealer, players: Players) {
        for (i: Int in 1..2) {
            dealer.draw(Deck.dealOut())
            players.draw()
        }
    }

    fun additionalDealOut(dealer: Dealer, players: Players) {
        while (dealer.isAvailableDealOut()) {
            OutputView.printDealerCardsStatus(dealer)
            dealer.draw(Deck.dealOut())
            OutputView.printDealOutResult(dealer)
        }
        players.getPlayers().forEach { dealOut(it) }
    }

    private fun dealOut(gamer: Gamer) {
        while (gamer.isAvailableDealOut() && isYes(gamer)) {
            gamer.draw(Deck.dealOut())
            OutputView.printDealOutResult(gamer)
        }
    }

    private fun isYes(gamer: Gamer): Boolean {
        val yesOrNo = InputView.receiveYesOrNoInput(gamer)
        return yesOrNo.lowercase() == YES
    }

}