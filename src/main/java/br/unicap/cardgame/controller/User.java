package br.unicap.cardgame.controller;

import br.unicap.cardgame.util.Utils;
import br.unicap.cardgame.ws.response.CardGameResponse;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import javax.ejb.Stateless;

@Stateless
public class User {
    
    public CardGameResponse authenticate(String username, String password) throws Exception {
        //buscar usuario no banco
//        Player player = 
        //comparar com usuario e senha enviado
        
//        if(username != player.getUsername() || password != player.getPassword()) {
//            throw new Exception("password invalido");
//        }        
        String token = Jwts.builder()
                .setSubject(username)
                .signWith(SignatureAlgorithm.HS512, Utils.APP_CLIENT_SECRET)
                .compact();
        return new CardGameResponse(true, 100034, token);
    }
}
