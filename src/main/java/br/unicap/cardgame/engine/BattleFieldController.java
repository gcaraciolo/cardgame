package br.unicap.cardgame.engine;

import br.unicap.cardgame.model.BattleFieldStatus;
import br.unicap.cardgame.model.Player;
import br.unicap.cardgame.model.PlayerFighter;
import br.unicap.cardgame.util.Constants;
import br.unicap.cardgame.ws.response.CardGameResponse;
import java.util.ArrayList;
import java.util.Queue;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class BattleFieldController {
    
    @EJB
    private BattleField battleField;
    
    public CardGameResponse addPlayer(Player player) {    
        if(alreadyJoinned(player, battleField.getPlayer1()) 
        || alreadyJoinned(player, battleField.getPlayer2())
        || battleField.getAudience().contains(player)) {
            return new CardGameResponse(true, 1001, "usarname already online");
        }
        
        battleField.addAudiencePlayer(player);        
        if(hasPlayersToPlay() && isBattleFieldEmpty()) {                
            battleField.firstFight();
            return new CardGameResponse(true, 1000, "Start fight");
        } else if(hasSomeOneOnline() && hasNextPlayersToPlay()) {
            battleField.nextFight();
            return new CardGameResponse(true, 1015, "You're going to fight with " + battleField.getPlayer1().getUsername());
        }
        return new CardGameResponse(true, 1002, "You're in the audience");
    }
    
    public CardGameResponse removePlayer(Player player) {
        PlayerFighter winner;
        if(player.equals(battleField.getPlayer1())) { 
            if(battleField.getPlayer2() == null) {
                battleField.setPlayer1(null);
                return new CardGameResponse(true, 1016, "Nobody else online.");
            }
            battleField.getPlayer1().setLife(0);
            winner = battleField.getPlayer2();
            nextBattle();
            return new CardGameResponse(true, 1003, "You're lost. " + winner.getUsername() + " win.");
        } else if(player.equals(battleField.getPlayer2())) {            
            battleField.getPlayer2().setLife(0);
            winner = battleField.getPlayer1();
            nextBattle();
            return new CardGameResponse(true, 1004, "You're lost. " + winner.getUsername() + " win.");            
        } else if(battleField.getAudience().contains(player)) {
            battleField.removeAudiencePlayer(player);
            return new CardGameResponse(true, 1005, "Left from audience");
        }        
        return new CardGameResponse(true, 1006, "You're not online");
    }
    
    public CardGameResponse connectedPlayers() {
        return new CardGameResponse(true, 1007, new ArrayList<Player>(battleField.getAudience()));        
    }
       
    public CardGameResponse move(Player player, int position) {                  
        if(!isEverybodyAlive()) { 
            return new CardGameResponse(true, 1008, "Nobody online.");
        }
        if(canMove(player) && canPutCardInGame()) {
            battleField.move(position);
            return new CardGameResponse(true, 1009, "Moved with success.");
        }
        return new CardGameResponse(true, 1010, "It's not your time.");
    }
     
    public CardGameResponse play(Player player, int answer) {                          
        boolean match = false;
        if(canMove(player)) {
            match = battleField.play(answer);
            if(!isEverybodyAlive()) {
                battleField.setLoster(loster());
                nextBattle();
                return new CardGameResponse(true, 1011, "You win");
            }
            return new CardGameResponse(true, 1012, match);
        }
        return new CardGameResponse(true, 1013, "It's not your time.");
    } 
    
    private void nextBattle() {
        PlayerFighter winner;
       
        winner = whoIsAlive();        
        winner.restart();
        removeLoster();
        battleField.setWinner(winner);        
        if(hasNextPlayersToPlay()) {
            battleField.nextFight();
            winner.setTimeToPlay(true);
        }
    }
    
    private PlayerFighter whoIsAlive() {        
        if(battleField.getPlayer1().isAlive()) {
            return battleField.getPlayer1();
        } 
        return battleField.getPlayer2();
    }
    
    private void removeLoster() {
        if(battleField.getPlayer1().getLife() <= 0) {
            battleField.setPlayer1(null);
        } else if (battleField.getPlayer2().getLife() <= 0) {
            battleField.setPlayer2(null);
        }  
    }
    
    public CardGameResponse gameStatus(Player requester) {
        BattleFieldStatus status = null;        
        PlayerFighter p1 = null, p2 = null;
        Queue<Player> audience = null;
        
        audience = battleField.getAudience();
        if(battleField.getPlayer1() != null && 
           requester.getUsername().equals(battleField.getPlayer1().getUsername())) {
           p1 = battleField.getPlayer1();
           p2 = battleField.getPlayer2();
        } else if(battleField.getPlayer2() != null &&
           requester.getUsername().equals(battleField.getPlayer2().getUsername())) {
           p1 = battleField.getPlayer2();
           p2 = battleField.getPlayer1();
        } else if(battleField.getLoster() != null &&
                requester.getUsername().equals(battleField.getLoster().getUsername())) {
            return new CardGameResponse(true, 1017, "Game over");
        }
        status = new BattleFieldStatus(p1, p2, audience);
        return new CardGameResponse(true, 1014, status);
    }    

    //helper methods
    private boolean canMove(Player player) {
        return player.equals(battleField.getCurrentPlayer());
    }
    
    private boolean isEverybodyAlive() {
        return battleField.getPlayer1().isAlive() && 
               battleField.getPlayer2().isAlive();
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
    
    private boolean hasSomeOneOnline() {
        return (battleField.getPlayer1() != null && battleField.getPlayer2() == null) ||
               (battleField.getPlayer1() == null && battleField.getPlayer2() != null);
    }
    
    private PlayerFighter loster() {
        if(battleField.getPlayer1().isAlive()) {
            return battleField.getPlayer2();
        }
        return battleField.getPlayer1();
    }
}