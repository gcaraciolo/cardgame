package br.unicap.cardgame.dao;

import br.unicap.cardgame.model.Chars;
import br.unicap.cardgame.model.Users;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CharsDAO {
    
    @PersistenceContext(unitName = "cardgame")
    private EntityManager em;
    
    public Chars getPlayerChar(String username) {
            Users u = em.createNamedQuery("Users.findByUsername", Users.class)
                    .setParameter("username", username)
                    .getSingleResult();
            Chars c = em.createNamedQuery("Chars.findById", Chars.class)
                    .setParameter("id", u.getCharId().getId())
                    .getSingleResult();
            return c;
    }
    
}
