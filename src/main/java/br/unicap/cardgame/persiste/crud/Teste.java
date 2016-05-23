package br.unicap.cardgame.persiste.crud;

import br.unicap.cardgame.controller.User;
import br.unicap.cardgame.persiste.model.Usuarios;

public class Teste {

	public static void main(String[] args) throws Exception {
		Usuarios user = Usuario.verificar("Paulo", "1234");
		
		User usuario = new User();
		
		usuario.authenticate("Paulo", "1234");
		
		
		System.out.println(user.getNome());
		System.out.println(user.getSenha());
	}

}
