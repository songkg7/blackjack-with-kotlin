package com.example.blackjack

import com.example.blackjack.controller.BlackjackGame
import com.example.blackjack.domain.GameResult
import com.example.blackjack.domain.card.Deck
import com.example.blackjack.domain.gamer.Dealer
import com.example.blackjack.domain.gamer.Players
import com.example.blackjack.view.InputView
import com.example.blackjack.view.OutputView

fun main() {
    val playerNames = InputView.receiveNameInput()
    val playersMap = playerNames.associateWith { InputView.receiveMoneyInput(it) }

    val players = Players(playersMap)
    val dealer = Dealer.appoint()

    val blackjackGame = BlackjackGame.newInstance(Deck.create())

    blackjackGame.firstDealOut(dealer, players)

    OutputView.printFirstDealOutResult(dealer, players)

    blackjackGame.additionalDealOut(dealer, players)

    val gameResult = GameResult(dealer, players)
    OutputView.printTotalResult(gameResult)

}
