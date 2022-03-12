package com.example.blackjack.domain.gamer

import com.example.blackjack.domain.card.Cards
import com.example.blackjack.domain.card.Deck

class Player(val name: String) : Gamer {

    var cards: Cards = Deck.firstDealOut()

    override fun open(): Int {
        return cards.calcValue()
    }

    // bust 나 blackJack 인 상황을 리스너를 사용해서 구현할 수는 없는지 시도해보기
    fun hit() {
        cards = cards.dealOut()
    }

}