/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicap.cardgame.controller;

import br.unicap.cardgame.model.Cards;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gcaraciolo
 */
public class CardController {
    
    @PersistenceContext(unitName = "cardgame")
    private EntityManager em;
    
    public int getCorretAnswer(int card_id) {        
        Cards card = em.find(Cards.class, card_id);
        System.out.println(card);
        System.out.println(card.getQuestionId().getCorrectAnswerId().getId());        
        return 1;
    }
}