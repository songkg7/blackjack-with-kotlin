package com.example.blackjack.domain.view

import java.util.Scanner

class InputView private constructor() {

    companion object {
        private val scanner: Scanner = Scanner(System.`in`)

        fun inputGamersName() {
            println("게임에 참가할 사람들의 이름을 입력해주세요 (,)")
            val nameInput = scanner.nextLine()
            val names = nameInput.split(",").map { it.trim() }

            // 딜러와 플레이어 역할 정하기
        }
    }

}