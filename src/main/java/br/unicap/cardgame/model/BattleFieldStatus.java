package br.unicap.cardgame.model;

public class BattleFieldStatus {

    private PlayerFighter currentPlayer, opponentPlayer, winner;    

    public BattleFieldStatus(PlayerFighter currentPlayer, PlayerFighter opponentPlayer) {
        this.currentPlayer = currentPlayer;
        this.opponentPlayer = opponentPlayer;
    }
    
    public BattleFieldStatus(PlayerFighter winner) {
        this.winner = winner;        
    }

    public PlayerFighter getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(PlayerFighter currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public PlayerFighter getOpponentPlayer() {
        return opponentPlayer;
    }

    public void setOpponentPlayer(PlayerFighter opponentPlayer) {
        this.opponentPlayer = opponentPlayer;
    }

    public PlayerFighter getWinner() {
        return winner;
    }

    public void setWinner(PlayerFighter winner) {
        this.winner = winner;
    }

    
}
