package br.unicap.cardgame.model;

import br.unicap.cardgame.controller.DecksController;
import br.unicap.cardgame.util.Constants;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PlayerFighter extends Player {

    private Chars character;    
    private List<Cards> availableCards;
    private Queue<Cards> cardsInGame;  
    private boolean matchLastQuestion;
    private boolean timeToPlay;
    private int life;
    private int attack;
    private int defense;
    
    public PlayerFighter(String username, Chars character) {
        super(username);
        this.character = character;   
        this.matchLastQuestion = false;
        setUp();
    }

    public Chars getCharacter() {
        return character;
    }

    public void setCharacter(Chars character) {
        this.character = character;
    }

    public List<Cards> getAvailableCards() {
        return availableCards;
    }

    public void setAvailableCards(List<Cards> availableCards) {
        this.availableCards = availableCards;
    }

    public Queue<Cards> getCardsInGame() {
        return cardsInGame;
    }

    public void setCardsInGame(Queue<Cards> cardsInGame) {
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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Cards useCardInGame() {
        return cardsInGame.poll();
    }

    public void addCardToAvailableCards(Cards card) {
        if(availableCards.size() < Constants.MAX_AVAILABLE_CARDS) {
            availableCards.add(card);
        }
    }
    
    public void putCardInGame(int position) {
        Cards card = availableCards.get(position);
        availableCards.remove(position);
        cardsInGame.add(card);        
    }
    
    public void restart() {        
        this.matchLastQuestion = true;
        setUp();                
    }
   
    private void setUp() {
        cardsInGame = new LinkedList<Cards>();
        life = 15;
        attack = 4;
        defense = 2;
    }
    
    public boolean isAlive() {
        return life > 0;
    }
    
    public void increasePower(Cards card) {
        attack += card.getAttack();
        life += card.getLife();
        defense += card.getDefense();                
    }
    
    public void receiveAttack(PlayerFighter opponent) {   
        int attackDamage = opponent.getAttack() - defense;
        if(attackDamage > 0) life -= attackDamage;        
    }
    
}
