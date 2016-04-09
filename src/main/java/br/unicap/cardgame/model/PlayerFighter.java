package br.unicap.cardgame.model;

import br.unicap.cardgame.util.Constants;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PlayerFighter extends Player {

    private Char character;    
    private List<Card> availableCards;
    private Queue<Card> cardsInGame;  
    private boolean matchLastQuestion;
    private boolean timeToPlay;
    
        
    public PlayerFighter(String username, Char character) {
        super(username);
        this.character = character;   
        this.matchLastQuestion = false;
        setUp();
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

    public Queue<Card> getCardsInGame() {
        return cardsInGame;
    }

    public void setCardsInGame(Queue<Card> cardsInGame) {
        this.cardsInGame = cardsInGame;
    }

    public boolean isMatchLastQuestion() {
        return matchLastQuestion;
    }

    public void setMatchLastQuestion(boolean matchLastQuestion) {
        this.matchLastQuestion = matchLastQuestion;
    }

    public boolean isTimeToPlay() {
        return timeToPlay;
    }

    public void setTimeToPlay(boolean timeToPlay) {
        this.timeToPlay = timeToPlay;
    }

    public Card useCardInGame() {
        return cardsInGame.poll();
    }

    public void addCardToAvailableCards(Card card) {
        if(availableCards.size() < Constants.MAX_AVAILABLE_CARDS) {
            availableCards.add(card);
        }
    }
    
    public void putCardInGame(int position) {
        Card card = availableCards.get(position);
        availableCards.remove(position);
        cardsInGame.add(card);        
    }
    
    public void restart() {        
        this.matchLastQuestion = true;
        character.restart();
        setUp();                
    }
   
    private void setUp() {
        availableCards = Deck.randonCards();
        cardsInGame = new LinkedList<>();
    }

    @Override
    public String toString() {
        return  "{" 
                    + "character:" + character + ","
                    + "availableCards:" + availableCards + ","
                    + "cardsInGame:" + cardsInGame + ","
                    + "matchLastQuestion:" + matchLastQuestion + ","
                    + "timeToPlay:" + timeToPlay 
                + "}";
    }
    
    
}
