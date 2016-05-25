package br.unicap.cardgame.controller;

import br.unicap.cardgame.model.Cards;

public class CardController {
        
    public int getCorretAnswer(Cards card) {        
        return card.getQuestionId().getCorrectAnswerId().getId();
    }
}