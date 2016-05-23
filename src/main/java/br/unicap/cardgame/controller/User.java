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

		Usuarios usuario = Usuario.verificar(username, password);

		if (usuario == null) {
			System.out.println("usuario nao cadastrado");
			throw new Exception("Usuário não cadastrado");
		} else {
			if (!username.equals(usuario.getNome()) || !password.equals(usuario.getSenha())) {
				System.out.println("password invalido");
				System.out.println(username);
				System.out.println(password);
				System.out.println(usuario.getNome());
				System.out.println(usuario.getSenha());
				throw new Exception("password invalido");
			}
			System.out.println("tudo ok com login");
			String token = Jwts.builder().setSubject(username)
					.signWith(SignatureAlgorithm.HS512, Utils.APP_CLIENT_SECRET).compact();
			return new CardGameResponse(true, 100034, token);
		}
	}
}
