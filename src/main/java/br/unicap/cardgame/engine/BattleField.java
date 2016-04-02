package br.unicap.cardgame.engine;

import br.unicap.cardgame.model.Card;
import br.unicap.cardgame.model.Char;
import br.unicap.cardgame.model.Deck;
import br.unicap.cardgame.model.Player;
import br.unicap.cardgame.model.PlayerFighter;
import java.util.LinkedList;
import java.util.Queue;
import javax.ejb.Singleton;

@Singleton
public class BattleField {
    
    private PlayerFighter currentPlayer, opponentPlayer, winner;
    private Queue<Player> audience = new LinkedList<>();
    
    /* getters and setters */
    public PlayerFighter getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(PlayerFighter currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public PlayerFighter getOpponentPlayer() {
        return opponentPlayer;
    }

    public void setOpponentPlayer(PlayerFighter opponentPlayer) {
        this.opponentPlayer = opponentPlayer;
    }

    public Queue<Player> getAudience() {
        return audience;
    }

    public void setAudience(Queue<Player> audience) {
        this.audience = audience;
    }

    public PlayerFighter getWinner() {
        return winner;
    }

    public void setWinner(PlayerFighter winner) {
        this.winner = winner;
    }
    
    /* engine */   
    public void addAudiencePlayer(Player player) {
        audience.add(player);    
    }
     
    public void removeAudiencePlayer(Player player) {
        audience.remove(player);               
    }
        
    public void move(int position) {        
        currentPlayer.putCardInGame(position);   
    }      
            
    public void firstFight() { 
        currentPlayer = createNewPlayerFighter(audience.poll());        
        opponentPlayer = createNewPlayerFighter(audience.poll());        
    }
    
    public void nextFight() { 
        currentPlayer = winner;
        opponentPlayer = createNewPlayerFighter(audience.poll());        
    }
    
    public void play(int answer) {  
        Card card = currentPlayer.useCardInGame();
        if(card.checkAnswer(answer)) {
            currentPlayer.getCharacter().increasePower(card);
            currentPlayer.setMatchLastQuestion(true);
        } else {
            currentPlayer.setMatchLastQuestion(false);
        }
        opponentPlayer.getCharacter().receiveAttack(currentPlayer.getCharacter());  
        getCardFromDeck();
        swapPlayers();
    }
    
    private void swapPlayers() {
        PlayerFighter swap = currentPlayer;
        currentPlayer = opponentPlayer;
        opponentPlayer = swap;
    }
    
    private void getCardFromDeck() {        
        Card card = Deck.randonCard();
        currentPlayer.addCardToAvailableCards(card);                
    }
    
    private PlayerFighter createNewPlayerFighter(Player player) {
        return new PlayerFighter(player.getUsername(), new Char(1));   //TODO criar aleatoriedade de personagens                         
    }

}
