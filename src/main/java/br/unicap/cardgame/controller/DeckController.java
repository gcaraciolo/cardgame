package br.unicap.cardgame.controller;

import br.unicap.cardgame.model.Cards;
import br.unicap.cardgame.model.Users;
import br.unicap.cardgame.util.Utils;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DeckController {
    
    @PersistenceContext(unitName = "cardgame")
    private EntityManager em;
    
    private List<Cards> userCards(Users u) {
        return em.createNativeQuery("select ca.id, ca.question_id, ca.attack, ca.defense, ca.life from users u, chars c, decks d, decks_cards dc, cards ca where \n" +
                "u.id = " + u.getId() + " and \n" +
                "u.char_id = c.id and \n" +
                "c.deck_id = d.id and \n" +
                "d.id = dc.deck_id and\n" +
                "dc.card_id = ca.id;", Cards.class).getResultList();    
    }
    
    public List<Cards> randonCards(Users u) {
        List<Cards> cards = userCards(u);
        if(cards.size() < 1) {
            return new ArrayList<Cards>();
        }
        List<Cards> randon = new ArrayList<Cards>();
        for(int i = 0; i < 3; i++) {
            randon.add(cards.get(Utils.getRandomNumber(0, cards.size())));
        }
        return randon;
    }

    public Cards randonCard(Users u) {
        List<Cards> cards = userCards(u);
        if(cards.size() < 1) {
            return null;
        }
        return cards.get(Utils.getRandomNumber(0, cards.size()));        
    }

}
