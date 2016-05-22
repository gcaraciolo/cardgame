package br.unicap.cardgame.persiste.crud;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.unicap.cardgame.persiste.model.Cartas;
import br.unicap.cardgame.persiste.model.Decks;
import br.unicap.cardgame.persiste.model.Personagens;
import br.unicap.cardgame.persiste.model.Usuarios;

public class Deck {

	/** Retorna um deck com todas as perguntas do banco */
	public static List<Cartas> carregaCartas(Usuarios user) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cardgame");
		EntityManager manager = factory.createEntityManager();

		Personagens personagem = manager.createQuery("from Personagens where codDeck = :codPers", Personagens.class)
				.setParameter("codPers", user.getCodpers()).getSingleResult();

		List<Decks> cartasDeck = manager.createQuery("from Decks where coddeck = :deck", Decks.class)
				.setParameter("deck", personagem.getCoddeck()).getResultList();

		List<Cartas> deck = manager.createQuery("from Cartas", Cartas.class).getResultList();

		List<Cartas> cartasPers = new ArrayList<>();
		
		for (Decks cardDeck : cartasDeck) {
			for(Cartas card: deck){
				if(cardDeck.getCodcarta() == card.getCod()){
					cartasPers.add(card);
				}
			}
		}
		
		return cartasPers;
	}
}
