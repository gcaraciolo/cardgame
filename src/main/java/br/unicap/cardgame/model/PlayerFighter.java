package br.unicap.cardgame.model;

import java.util.ArrayList;
import java.util.List;

public class PlayerFighter extends Player {

    private Char character;    
    private List<Card> availableCards;
    private List<Card> cardsInGame;
        
    public PlayerFighter(String username, Char character) {
        super(username);
        this.character = character;        
        availableCards = Deck.randonCards();
        cardsInGame = new ArrayList<>();
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

    public List<Card> getCardsInGame() {
        return cardsInGame;
    }

    public void setCardsInGame(List<Card> cardsInGame) {
        this.cardsInGame = cardsInGame;
    }  

    public void receiveCard(Card card) {        
        card.doAction(this.getCharacter());        
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
