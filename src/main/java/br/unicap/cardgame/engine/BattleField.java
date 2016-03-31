package br.unicap.cardgame.engine;

import br.unicap.cardgame.model.BattleFieldStatus;
import br.unicap.cardgame.model.Card;
import br.unicap.cardgame.model.Char;
import br.unicap.cardgame.model.Deck;
import br.unicap.cardgame.model.Player;
import br.unicap.cardgame.model.PlayerFighter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.ejb.Singleton;

@Singleton
public class BattleField {
    
    private PlayerFighter currentPlayer, opponentPlayer;
    private Queue<Player> audience = new LinkedList<>();
    
        
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
//        currentPlayer = audience.poll(); // como saver o character?
//        opponentPlayer = audience.poll();
    }
   
    public void move(Player player, int position) {
        if(!isEverybodyAlive()) return;
        if(canMove(player)) {
            currentPlayer.putCardInGame(position);   
            Card card = currentPlayer.popCard();
            currentPlayer.getCharacter().silviugay(card);
            
            int f = currentPlayer.getCharacter().getAttack() - opponentPlayer.getCharacter().getDefense();
            int v = opponentPlayer.getCharacter().getLife() - f;
            opponentPlayer.getCharacter().setLife(v);
            
            swapPlayers();
        }
    }
    
    public void play(Player player) {   
//        if(canMove(player)) {
//            //play.. pega cartas em jogo, faz alguma coisa com o currentPlayer e com o opponentPLayer.
//            
//            //swap
//            swapPlayers();       
//        }
    }
    
    public void swapPlayers() {
        PlayerFighter swap = currentPlayer;
        currentPlayer = opponentPlayer;
        opponentPlayer = swap;
    }
    
    public boolean isEverybodyAlive() {
        return currentPlayer.getCharacter().isAlive() && opponentPlayer.getCharacter().isAlive();
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
    
    public void getCardFromDeck(Player player) {
        if(canMove(player)) {
            Card card = Deck.randonCard();
            currentPlayer.addCardToAvailableCards(card);
        }        
    }
        
    public boolean canMove(Player player) {
        return player.equals(currentPlayer);
    }
}
