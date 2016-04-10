package br.unicap.cardgame.engine;

import br.unicap.cardgame.model.BattleFieldStatus;
import br.unicap.cardgame.model.Player;
import br.unicap.cardgame.model.PlayerFighter;
import br.unicap.cardgame.util.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class BattleFieldController {
    
    @EJB
    private BattleField battleField;

    public void addPlayer(Player player) {    
        if(alreadyJoinned(player, battleField.getPlayer1()) 
        || alreadyJoinned(player, battleField.getPlayer2())
        || battleField.getAudience().contains(player)) {
            return;
        }            
        battleField.addAudiencePlayer(player);        
        if(hasPlayersToPlay() && isBattleFieldEmpty()) {                
            battleField.firstFight();            
        }
    }
    
    public void removePlayer(Player player) {
        if(player.equals(battleField.getPlayer1())) {
            battleField.setPlayer1(null);
            battleField.setWinner(battleField.getPlayer2());
        } else if(player.equals(battleField.getPlayer2())) {
            battleField.setPlayer2(null);
            battleField.setWinner(battleField.getPlayer1());
        } else if(battleField.getAudience().contains(player)) {
            battleField.removeAudiencePlayer(player);
        }        
    }
    
    public List<Player> connectedPlayers() {
        return new ArrayList<>(battleField.getAudience());        
    }
       
    public void move(Player player, int position) {                  
        if(!isEverybodyAlive()) return;
        if(canMove(player) && canPutCardInGame()) {
            battleField.move(position);
        }
    }
     
    public boolean play(Player player, int answer) {                          
        boolean match = false;
        if(canMove(player)) {
            match = battleField.play(answer);
            if(!isEverybodyAlive()) {     
                 nextBattle();
             }
        }
        return match;
    } 
    
    private void nextBattle() {
        PlayerFighter winner = whoIsAlive();
        winner.restart();
        battleField.setWinner(winner);
        if(hasNextPlayersToPlay()) {
            battleField.nextFight();
            winner.setTimeToPlay(true);
        }
    }
    
     private PlayerFighter whoIsAlive() {        
         if(battleField.getPlayer1().getCharacter().isAlive()) {
             return battleField.getPlayer1();
         } 
         return battleField.getPlayer2();
     }
    
    public BattleFieldStatus gameStatus(Player requester) {
        BattleFieldStatus status = null;        
        PlayerFighter p1 = null, p2 = null;
        Queue<Player> audience = null;
        if(battleField.getPlayer1() != null && battleField.getPlayer2() != null) {             
            if(requester.getUsername().equals(battleField.getPlayer1().getUsername())) {
                p1 = battleField.getPlayer1();
                p2 = battleField.getPlayer2();                                    
                audience = battleField.getAudience();
            } else if(requester.getUsername().equals(battleField.getPlayer2().getUsername()) || battleField.getAudience().contains(requester)) {
                p1 = battleField.getPlayer2();
                p2 = battleField.getPlayer1();
                audience = battleField.getAudience();
            } 
            
        }
        status = new BattleFieldStatus(p1, p2, audience);
        return status;
    }    

    //helper methods
    private boolean canMove(Player player) {
        return player.equals(battleField.getCurrentPlayer());
    }
    
    private boolean isEverybodyAlive() {
        return battleField.getPlayer1().getCharacter().isAlive() && 
               battleField.getPlayer2().getCharacter().isAlive();
    }
    
    private boolean canPutCardInGame() {
        return battleField.getCurrentPlayer().getCardsInGame().size() < Constants.MAX_CARDS_IN_GAME;
    }
    
    private boolean isBattleFieldEmpty() {
        return battleField.getPlayer1() == null && 
               battleField.getPlayer2() == null;
    }
    
    private boolean hasPlayersToPlay() {
        return battleField.getAudience().size() > 1;
    }
    
    private boolean hasNextPlayersToPlay() {
         return battleField.getAudience().size() > 0;
    }
    
    private boolean alreadyJoinned(Player player, PlayerFighter fighter) {
        return fighter != null && player.getUsername().equals(fighter.getUsername());                
    }
}