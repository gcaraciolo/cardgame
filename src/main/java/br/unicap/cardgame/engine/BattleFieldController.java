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
    
    private CardGameResponse response(boolean status, int code, Object msg) {
        CardGameResponse response = new CardGameResponse(status, code, msg);
        return response;
    }

    public CardGameResponse addPlayer(Player player) {    
        if(alreadyJoinned(player, battleField.getPlayer1()) 
        || alreadyJoinned(player, battleField.getPlayer2())
        || battleField.getAudience().contains(player)) {
            return response(true, 1001, "usarname already online");
        }
        
        battleField.addAudiencePlayer(player);        
        if(hasPlayersToPlay() && isBattleFieldEmpty()) {                
            battleField.firstFight();
            return response(true, 1000, "Start fight");
        } else if(hasSomeOneOnline() && hasNextPlayersToPlay()) {
            battleField.nextFight();
            return response(true, 1015, "You're going to fight with " + battleField.getPlayer1().getUsername());
        }
        return response(true, 1002, "You're in the audience");
    }
    
    public CardGameResponse removePlayer(Player player) {
        PlayerFighter winner;
        if(player.equals(battleField.getPlayer1())) {            
            battleField.getPlayer1().getCharacter().setLife(0);
            winner = battleField.getPlayer2();
            nextBattle();
            return response(true, 1003, "You're lost. " + winner.getUsername() + " win.");
        } else if(player.equals(battleField.getPlayer2())) {            
            battleField.getPlayer2().getCharacter().setLife(0);
            winner = battleField.getPlayer1();
            nextBattle();
            return response(true, 1004, "You're lost. " + winner.getUsername() + " win.");            
        } else if(battleField.getAudience().contains(player)) {
            battleField.removeAudiencePlayer(player);
            return response(true, 1005, "Left from audience");
        }        
        return response(true, 1006, "You're not online");
    }
    
    public CardGameResponse connectedPlayers() {
        return response(true, 1007, new ArrayList<>(battleField.getAudience()));        
    }
       
    public CardGameResponse move(Player player, int position) {                  
        if(!isEverybodyAlive()) { 
            return response(true, 1008, "Nobody online.");
        }
        if(canMove(player) && canPutCardInGame()) {
            battleField.move(position);
            return response(true, 1009, "Moved with success.");
        }
        return response(true, 1010, "It's not your time.");
    }
     
    public CardGameResponse play(Player player, int answer) {                          
        boolean match = false;
        if(canMove(player)) {
            match = battleField.play(answer);
            if(!isEverybodyAlive()) {     
                nextBattle();
                return response(true, 1011, "You win");
            }
            return response(true, 1012, match);
        }
        return response(true, 1013, "It's not your time.");
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
        if(battleField.getPlayer1().getCharacter().isAlive()) {
            return battleField.getPlayer1();
        } 
        return battleField.getPlayer2();
    }
    
    private void removeLoster() {
        if(battleField.getPlayer1().getCharacter().getLife() <= 0) {
            battleField.setPlayer1(null);
        } else if (battleField.getPlayer2().getCharacter().getLife() <= 0) {
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
        }
        status = new BattleFieldStatus(p1, p2, audience);
        return response(true, 1014, status);
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
    
    private boolean hasSomeOneOnline() {
        return (battleField.getPlayer1() != null && battleField.getPlayer2() == null) ||
               (battleField.getPlayer1() == null && battleField.getPlayer2() != null);
    }
}