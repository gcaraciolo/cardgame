package br.unicap.cardgame.model;

public class Char {
    
    private int type;    
    private int life;    
    private int attack;           
    private int defense;

    public Char(int type) {
        this.type = type;
        this.life = 5;
        this.attack = 1;
        this.defense = 2;
    }
    
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
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
    
    public boolean isAlive() {
        return life > 0;
    }
    
    public void silviugay(Card card) {
        this.attack += card.getAttack();
        this.life += card.getLife();
        this.defense += card.getDefense();                
    }
}
