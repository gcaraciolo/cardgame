package br.unicap.cardgame.model;

public class BattleFieldStatus {

    private Player player1, player;    

    public BattleFieldStatus(Player player1, Player player) {
        this.player1 = player1;
        this.player = player;        
    }
    
    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}
