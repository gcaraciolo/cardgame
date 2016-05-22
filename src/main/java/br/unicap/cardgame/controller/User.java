package br.unicap.cardgame.controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.unicap.cardgame.persiste.crud.Usuario;
import br.unicap.cardgame.persiste.model.Usuarios;
import br.unicap.cardgame.util.Utils;
import br.unicap.cardgame.ws.response.CardGameResponse;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Stateless
public class User {

	public CardGameResponse authenticate(String username, String password) throws Exception {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cardgame");
		EntityManager manager = factory.createEntityManager();

		Usuarios usuario = Usuario.verificar(username, password);

		if (usuario == null) {
			throw new Exception("Usuário não cadastrado");
		} else {
			if (username != usuario.getNome() || password != usuario.getSenha()) {
				throw new Exception("password invalido");
			}
			String token = Jwts.builder().setSubject(username)
					.signWith(SignatureAlgorithm.HS512, Utils.APP_CLIENT_SECRET).compact();
			return new CardGameResponse(true, 100034, token);
		}
	}
}
