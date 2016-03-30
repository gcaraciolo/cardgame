package br.unicap.cardgame.model;

import java.io.Serializable;

public class BattleFieldStatus implements Serializable {

    private PlayerFighter player1, player2;    

    public BattleFieldStatus(PlayerFighter player1, PlayerFighter player2) {
        this.player1 = player1;
        this.player2 = player2;        
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
    
    

}
