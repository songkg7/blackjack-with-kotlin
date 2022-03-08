package com.example.blackjack

import com.example.blackjack.controller.BlackjackApp
import com.example.blackjack.domain.view.InputView
import com.example.blackjack.domain.view.OutputView
import java.util.Scanner

fun main() {
    val inputView = InputView(Scanner(System.`in`))
    val outputView = OutputView()
    val blackjackApp = BlackjackApp(inputView, outputView)
    blackjackApp.run()
}
