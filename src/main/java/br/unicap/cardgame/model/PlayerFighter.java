package br.unicap.cardgame.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PlayerFighter extends Player {

    private Char character;    
    private List<Card> availableCards;
    private Queue<Card> cardsInGame;    
        
    public PlayerFighter(String username, Char character) {
        super(username);
        this.character = character;        
        availableCards = Deck.randonCards();
        cardsInGame = new LinkedList<>();
    }

    public Char getCharacter() {
        return character;
    }

    public void setCharacter(Char character) {
        this.character = character;
    }

    public List<Card> getAvailableCards() {
        return availableCards;
    }

    public void setAvailableCards(List<Card> availableCards) {
        this.availableCards = availableCards;
    }

    public Card popCard() {
        return cardsInGame.poll();
    }

    public void addCardToAvailableCards(Card card) {
        if(availableCards.size() < 3) {
            availableCards.add(card);
        }
    }
    
    public void putCardInGame(int position) {
        Card card = availableCards.get(position);
        availableCards.remove(position);
        cardsInGame.add(card);        
    }
    
}
