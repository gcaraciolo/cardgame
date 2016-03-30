package br.unicap.cardgame.model;

public class BattleFieldStatus {

    private PlayerFighter player1, player2;    

    public BattleFieldStatus(PlayerFighter player1, PlayerFighter player2) {
        this.player1 = player1;
        this.player2 = player2;        
    }
    
    public PlayerFighter getPlayer1() {
        return player1;
    }

    public void setPlayer1(PlayerFighter player) {
        this.player1 = player;
    }

    public PlayerFighter getPlayer() {
        return player2;
    }

    public void setPlayer(PlayerFighter player) {
        this.player2 = player;
    }

}
