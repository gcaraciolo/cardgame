package br.unicap.cardgame.controller;

import br.unicap.cardgame.dao.DecksDAO;
import br.unicap.cardgame.model.Cards;
import br.unicap.cardgame.model.Users;
import br.unicap.cardgame.util.Utils;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class DecksController {

    @EJB
    private DecksDAO decksDAO;

    public List<Cards> randonCards(Users u) {
        List<Cards> cards = decksDAO.getUserCards(u);
        if (cards.size() < 1) {
            return new ArrayList<Cards>();
        }
        List<Cards> randon = new ArrayList<Cards>();
        for (int i = 0; i < 3; i++) {
            randon.add(cards.get(Utils.getRandomNumber(0, cards.size())));
        }
        return randon;
    }

    public Cards randonCard(Users u) {
        List<Cards> cards = decksDAO.getUserCards(u);
        if (cards.size() < 1) {
            return null;
        }
        return cards.get(Utils.getRandomNumber(0, cards.size()));
    }

}
