package br.unicap.cardgame.persiste.crud;

import br.unicap.cardgame.persiste.model.Usuarios;

public class Teste {

	public static void main(String[] args) {
		Usuarios user = Usuario.verificar("Paulo", "1234");
		
		System.out.println(user.getNome());
	}

}
