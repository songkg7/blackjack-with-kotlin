package com.example.blackjack.view

import com.example.blackjack.domain.gamer.Player
import java.util.Scanner

class InputView(private val scanner: Scanner) {

    fun inputGamersName(): List<String> {
        println("게임에 참가할 사람들의 이름을 입력해주세요 (,)")
        val nameInput = scanner.nextLine()
        return nameInput.split(",").map { it.trim() }
    }

    fun dealOutSelectMessage(player: Player): String {
        println("현재 ${player.name} 의 점수는 ${player.open()}점 입니다.")
        println("카드를 한 장 더 뽑으시겠습니까?")
        return scanner.nextLine()
    }
}