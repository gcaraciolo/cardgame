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
    
    private PlayerFighter currentPlayer, opponentPlayer;
    private List<Player> audience = new ArrayList<>();
        
    public void addPlayer(Player player, Char character) {
        if (currentPlayer == null) {
            currentPlayer = new PlayerFighter(player.getUsername(), character);            
        } else if(opponentPlayer == null) {
            opponentPlayer = new PlayerFighter(player.getUsername(), character);
        } else {
            audience.add(player);
        }
    }
    
    public boolean removePlayer(Player player) {
        if(currentPlayer != null && currentPlayer.equals(player)) {
            finishGame();
            return true;
        } else if (opponentPlayer != null && opponentPlayer.equals(player)) {
            finishGame();
            return true;
        } else if(audience.contains(player)) {
            audience.remove(player);
            return true;    
        }
        return false;
    }
    
    public void finishGame() {
        currentPlayer = opponentPlayer = null;
    }
   
    public void move(Player player, Card card) {
        if(currentPlayer.getUsername().equals(player.getUsername())){
            switch(card.getType()) {
                case 1:
                    currentPlayer.getCharacter().increaseLife(1);
                    break;
                case 2:
                    opponentPlayer.getCharacter().decreaseLife(currentPlayer.getCharacter().getAttack());
                    break;                    
                case 3:
                    currentPlayer.getCharacter().increaseAttack(1);
                    break;
                default:
                    break;
            }                               
            round();
        }
    }
    
    public void round() {   
        PlayerFighter swap = currentPlayer;
        currentPlayer = opponentPlayer;
        opponentPlayer = swap;
    }
    
    public List<Player> connectedPlayers() {   
        List<Player> playersOnline = new ArrayList<>();
        if(currentPlayer != null) playersOnline.add(currentPlayer);
        if(opponentPlayer != null) playersOnline.add(opponentPlayer);
        playersOnline.addAll(audience);
        return playersOnline;
    }
    
    public BattleFieldStatus status() {
        if(currentPlayer == null || opponentPlayer == null) return null;
        BattleFieldStatus status = new BattleFieldStatus(currentPlayer, opponentPlayer);
        return status;
    }
        
}
