package br.unicap.cardgame.model;

import java.util.List;

public class PlayerFighter extends Player {

    private Char character;    
    private List<Card> availableCards;
    private List<Card> cardsSelecteds;
        
    public PlayerFighter(String username, Char character) {
        super(username);
        this.character = character;        
        availableCards = Deck.randonCards();
    }

    public Char getCharacter() {
        return character;
    }

    public void setCharacter(Char character) {
        this.character = character;
    }

    public List<Card> getCardsAvailable() {
        return availableCards;
    }

    public void setCardsAvailable(List<Card> availableCards) {
        this.availableCards = availableCards;
    }

    public List<Card> getCardsSelecteds() {
        return cardsSelecteds;
    }

    public void setCardsSelecteds(List<Card> cardsSelecteds) {
        this.cardsSelecteds = cardsSelecteds;
    }

    public void receiveCard(Card card) {        
        card.doAction(this.getCharacter());        
    }
    
    
    
}
