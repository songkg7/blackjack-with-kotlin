package com.example.blackjack.domain.gamer

class Name(name: String) {
    init {
        if (name.isBlank()) {
            throw IllegalArgumentException("비어있는 이름이 있습니다.")
        }
    }
}