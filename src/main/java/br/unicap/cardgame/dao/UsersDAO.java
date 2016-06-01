package br.unicap.cardgame.dao;

import br.unicap.cardgame.model.Users;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class UsersDAO {
    
    @PersistenceContext(unitName = "cardgame")
    private EntityManager em;
    
    public Users getUserByUsername(String username) {
        return em.createNamedQuery("Users.findByUsername", Users.class)
                    .setParameter("username", username)
                    .getSingleResult();        
    }  
    
    public Boolean changeUserChar(int user_id, int char_id) {
        boolean status = false;
        try {            
            String hql = "UPDATE Users SET charId.id = :char_id " + 
                    "WHERE id = :user_id";
            Query query = em.createQuery(hql);
            query.setParameter("char_id", char_id)
                .setParameter("user_id", user_id);
            status = query.executeUpdate() > 0;
        } catch(Exception e) {
            System.err.println(e);
        }
        return status;
    }
    
}
