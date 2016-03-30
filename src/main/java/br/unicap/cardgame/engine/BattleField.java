package br.unicap.cardgame.engine;

import br.unicap.cardgame.model.BattleFieldStatus;
import br.unicap.cardgame.model.Card;
import br.unicap.cardgame.model.Char;
import br.unicap.cardgame.model.Player;
import br.unicap.cardgame.model.PlayerFighter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;

@Singleton
public class BattleField {
    
    private PlayerFighter player1, player2;
    private PlayerFighter currentPlayer, opponentPlayer;
    private List<Player> audience = new ArrayList<>();
        
    public void addPlayer(Player player, Char character) {
        if (player1 == null) {
            player1 = new PlayerFighter(player.getUsername(), character);
        } else if(player2 == null) {
            player2 = new PlayerFighter(player.getUsername(), character);
            configGame();
        } else {
            audience.add(player);
        }
    }
    
    public void configGame() {               
        currentPlayer = player1;
        opponentPlayer = player2;          
    }
    
    public void move(Card card) {
        currentPlayer.receiveCard(card);  
        
        round();
    }
    
    public void round() {
        //boolean quem pode jogar ou nao
//        if(currentPlayer.getCharacter().isAlive() && opponentPlayer.getCharacter().isAlive());
        
        currentPlayer = getCurrentPlayer();
        opponentPlayer = getOpponentPlayer();
    }
    
    private PlayerFighter getCurrentPlayer() {
        return currentPlayer == player1 ? player2 : player1;        
    }
    
    private PlayerFighter getOpponentPlayer() {
        return opponentPlayer == player2 ? player1 : player2;        
    }
    
    public List<Player> connectedPlayers() {   
        List<Player> playersOnline = new ArrayList<>();
        if(player1 != null) playersOnline.add(player1);
        if(player2 != null) playersOnline.add(player2);
        playersOnline.addAll(audience);
        return playersOnline;
    }
    
    public BattleFieldStatus status() {
        if(player1 == null || player2 == null) return null;
        BattleFieldStatus status = new BattleFieldStatus(player1, player2);
        return status;
    }
        
}
