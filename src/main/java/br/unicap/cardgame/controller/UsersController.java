package br.unicap.cardgame.controller;

import br.unicap.cardgame.dao.UsersDAO;
import br.unicap.cardgame.model.Player;
import br.unicap.cardgame.model.Users;
import br.unicap.cardgame.util.Utils;
import br.unicap.cardgame.ws.response.CardGameResponse;
import javax.ejb.Stateless;
import br.unicap.cardgame.ws.response.CardGameResponseToken;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import javax.ejb.EJB;

@Stateless
public class UsersController {
    
        @EJB
        private UsersDAO usersDAO;

	public CardGameResponseToken authenticate(String username, String password) throws Exception {
            
            Users u = usersDAO.getUserByUsername(username);
            
            if(u == null || !verifyPassword(u, password)) {
                throw new Exception("password invalido");
            }      
            Player p = new Player(u.getId(), u.getUsername());
            String token = Jwts.builder()
                       .setSubject(p.toString())
                       .signWith(SignatureAlgorithm.HS512, Utils.APP_CLIENT_SECRET)
                       .compact();       
            
            return new CardGameResponseToken(true, token);
	}
        
        private boolean verifyPassword(Users user, String password) {
            return user.getPassword().equals(password);
        }
        
        public Users getUserByUsername(String username) {
            return usersDAO.getUserByUsername(username);
        }
        
        public CardGameResponse changeUserChar(int user_id, int char_id) {
            boolean update = usersDAO.changeUserChar(user_id, char_id);
            if(update) {
                return new CardGameResponse(true, 2000, "Char alterado com sucesso");
            }
            return new CardGameResponse(true, 2000, "Falha ao alterar char!");
        }
}
