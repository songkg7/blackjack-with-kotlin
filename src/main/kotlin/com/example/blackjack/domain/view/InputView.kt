package com.example.blackjack.domain.view

import java.util.Scanner

class InputView(private val scanner: Scanner) {

    fun inputGamersName(): List<String> {
        println("게임에 참가할 사람들의 이름을 입력해주세요 (,)")
        val nameInput = scanner.nextLine()
        return nameInput.split(",").map { it.trim() }
    }
}