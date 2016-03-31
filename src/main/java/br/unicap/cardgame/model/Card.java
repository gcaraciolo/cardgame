package br.unicap.cardgame.model;

public class Card {
    
    private int attack;
    private int defense;
    private int life;

    public Card(int attack, int defense, int life) {
        this.attack = attack;
        this.defense = defense;
        this.life = life;
    }
    
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

}
