package br.unicap.cardgame.model;

import java.util.Queue;

public class BattleFieldStatus {

    private PlayerFighter player1, player2;        
    private Queue<Player> audience;

    public BattleFieldStatus(PlayerFighter player1, PlayerFighter player2, Queue<Player> audience) {
        this.player1 = player1;
        this.player2 = player2;
        this.audience = audience;
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

    public Queue<Player> getAudience() {
        return audience;
    }

    public void setAudience(Queue<Player> audience) {
        this.audience = audience;
    }

    @Override
    public String toString() {
        return  "{" 
                    + "player1:" + player1 + ","
                    + "player2:" + player2 + ","
                    + "audience:" + audience 
                + "}";
    }

    
    
}
