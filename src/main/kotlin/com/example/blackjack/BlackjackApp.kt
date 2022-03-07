package com.example.blackjack

import java.util.Scanner

class BlackjackApp

fun main(array: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("게임에 참가할 사람들의 이름을 입력해주세요 (,)")
    val nameInput = scanner.nextLine()
    val names = nameInput.split(",").map { it.trim() }

    println("names: $names")
}
