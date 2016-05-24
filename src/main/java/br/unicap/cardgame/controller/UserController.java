package br.unicap.cardgame.controller;

import br.unicap.cardgame.model.Users;
import br.unicap.cardgame.util.Utils;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import br.unicap.cardgame.ws.response.CardGameResponseToken;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class UserController {

        @PersistenceContext(unitName = "cardgame")
        private EntityManager em;
        
	public CardGameResponseToken authenticate(String username, String password) throws Exception {
            
            Users u = em.createNamedQuery("Users.findByUsername", Users.class)
                    .setParameter("username", username)
                    .getSingleResult();
            
            if(u == null || !verifyPassword(u, password)) {
                throw new Exception("password invalido");
            }      
            
            String token = Jwts.builder()
                       .setSubject(username)
                       .signWith(SignatureAlgorithm.HS512, Utils.APP_CLIENT_SECRET)
                       .compact();       
            
            return new CardGameResponseToken(true, token);
	}
        
        private boolean verifyPassword(Users user, String password) {
            return user.getPassword().equals(password);
        }
}