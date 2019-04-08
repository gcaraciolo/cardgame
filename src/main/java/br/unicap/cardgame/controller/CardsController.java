package br.unicap.cardgame.controller;

import br.unicap.cardgame.model.Cards;

public class CardsController {

    public int getCorretAnswer(Cards card) {
        return card.getQuestionId().getCorrectAnswerId().getId();
    }
}
