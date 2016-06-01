package br.unicap.cardgame.dao;

import br.unicap.cardgame.model.Cards;
import br.unicap.cardgame.model.Users;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DecksDAO {
    
    @PersistenceContext(unitName = "cardgame")
    private EntityManager em;
    
    public List<Cards> getUserCards(Users u) {
        return em.createNativeQuery("select ca.id, ca.question_id, ca.attack, ca.defense, ca.life from users u, chars c, decks d, decks_cards dc, cards ca where \n" +
                "u.id = " + u.getId() + " and \n" +
                "u.char_id = c.id and \n" +
                "c.deck_id = d.id and \n" +
                "d.id = dc.deck_id and\n" +
                "dc.card_id = ca.id;", Cards.class).getResultList();    
    }
}
