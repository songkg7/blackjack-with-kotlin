package com.example.blackjack.view

import com.example.blackjack.domain.Money
import java.util.Scanner

class InputView {
    companion object {
        val scanner: Scanner = Scanner(System.`in`)

        fun receiveNameInput(): List<String> {
            println("게임에 참가할 사람들의 이름을 입력해주세요. (, 로 구분)")
            val nameInput = scanner.nextLine()
            return convertToPlayerNames(nameInput)
        }

        private fun convertToPlayerNames(nameInput: String) = nameInput.split(",").map { it.trim() }

        fun receiveMoneyInput(name: String): Money {
            println("$name 의 베팅금액은?")
            val amount = scanner.nextLine()
            return Money(Integer.parseInt(amount))
        }
    }
}