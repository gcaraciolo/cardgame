package br.unicap.cardgame.engine;

import br.unicap.cardgame.controller.CardController;
import br.unicap.cardgame.model.Cards;
import br.unicap.cardgame.model.Chars;
import br.unicap.cardgame.model.Deck;
import br.unicap.cardgame.model.Player;
import br.unicap.cardgame.model.PlayerFighter;
import java.util.LinkedList;
import java.util.Queue;
import javax.ejb.Singleton;

@Singleton
public class BattleField {
    
    private PlayerFighter player1, player2, winner, loster;
    private final Queue<Player> audience = new LinkedList<Player>();
    
    /* getters and setters */        
    public Queue<Player> getAudience() {
        return audience;
    }

    public PlayerFighter getPlayer1() {
        return player1;
    }

    public void setPlayer1(PlayerFighter player1) {
        this.player1 = player1;
    }

    public PlayerFighter getPlayer2() {
        return player2;
    }

    public void setPlayer2(PlayerFighter player2) {
        this.player2 = player2;
    }
    
    public PlayerFighter getWinner() {
        return winner;
    }

    public void setWinner(PlayerFighter winner) {
        this.winner = winner;
    }

    public PlayerFighter getLoster() {
        return loster;
    }

    public void setLoster(PlayerFighter loster) {
        this.loster = loster;
    }
    
    /* engine */   
    public void addAudiencePlayer(Player player) {
        audience.add(player);    
    }
     
    public void removeAudiencePlayer(Player player) {
        audience.remove(player);               
    }
        
    public void move(int position) {        
        getCurrentPlayer().putCardInGame(position);   
    }      
            
    public void firstFight() { 
        player1 = createNewPlayerFighter(audience.poll());
        player2 = createNewPlayerFighter(audience.poll());        
        player1.setTimeToPlay(true);        
    }
    
    public void nextFight() {          
         player1 = winner;
         player2 = createNewPlayerFighter(audience.poll());        
         player1.setTimeToPlay(true);        
    }
    
    public boolean play(int answerID) {  
        boolean match = false;
        Cards card = getCurrentPlayer().useCardInGame();        
        if(checkAnswer(card.getId(), answerID)) {
            getCurrentPlayer().increasePower(card);            
            match = true;
        }
        getOpponentPlayer().receiveAttack(getCurrentPlayer());  
        getCardFromDeck();
        swapPlayers();
        return match;
    }
    
    private void swapPlayers() {                
        if(player1.isTimeToPlay()) {
            player1.setTimeToPlay(false);
            player2.setTimeToPlay(true);
        } else {
            player1.setTimeToPlay(true);
            player2.setTimeToPlay(false);
        }            
    }
    
    private void getCardFromDeck() {        
        Cards card = Deck.randonCard();
        getCurrentPlayer().addCardToAvailableCards(card);                
    }
    
    private PlayerFighter createNewPlayerFighter(Player player) {
        return new PlayerFighter(player.getUsername(), new Chars(1));   //TODO criar aleatoriedade de personagens                         
    }

    private boolean checkAnswer(int card_id, int answer_id) {
        CardController cardController = new CardController();
        int correctAnswer = cardController.getCorretAnswer(card_id);         
        return correctAnswer == answer_id;
    }
    
    public PlayerFighter getCurrentPlayer() {
        return player1.isTimeToPlay() ? player1 : player2;
    }
    
    public PlayerFighter getOpponentPlayer() {
        return getCurrentPlayer() == player1 ? player2 : player1;
    }
}
