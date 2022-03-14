package com.example.blackjack.domain.gamer

class Name(private val name: String) {
    init {
        if (name.isBlank()) {
            throw IllegalArgumentException("비어있는 이름이 있습니다.")
        }
    }

    override fun toString(): String {
        return "Name(name='$name')"
    }

}