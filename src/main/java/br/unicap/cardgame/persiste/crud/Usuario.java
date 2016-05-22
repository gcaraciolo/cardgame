package br.unicap.cardgame.persiste.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import br.unicap.cardgame.persiste.model.Usuarios;

public class Usuario {

	/** Função para cadastrar o usuario no banco */
	public static void cadastrar(Usuarios usuario) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cardgame");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(usuario);
		manager.getTransaction().commit();

		manager.close();
		factory.close();
	}
	
	/** Função que verificar se o usuario existe no banco */
	public static Usuarios verificar(String usuario, String senha) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cardgame");
		EntityManager manager = factory.createEntityManager();

		try {
			Usuarios user = manager.createQuery("from Usuarios where upper(nome) = :usuario", Usuarios.class)
					.setParameter("usuario", usuario.toLowerCase()).getSingleResult();
			if(user.getSenha().equals(senha)){
				return user;	
			} else {
				return null;
			}
		} catch (NoResultException e) {
			System.out.println("Usuario não existe");
		} finally {
			manager.close();
			factory.close();
		}
		return null;
	}
}
