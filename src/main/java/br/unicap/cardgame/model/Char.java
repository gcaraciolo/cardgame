package br.unicap.cardgame.model;

public class Char {
    
    private int type;    
    private int life;    
    private int attack;           
    private int defense;

    public Char(int type) {
        this.type = type;
        this.life = 5;
        this.attack = 3;
        this.defense = 1;
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
    
    public void increasePower(Card card) {
        this.attack += card.getAttack();
        this.life += card.getLife();
        this.defense += card.getDefense();                
    }
    
    public void receiveAttack(Char character) {   
        int attackDamage = character.getAttack() - defense;
        if(attackDamage > 0)
            life -= attackDamage;        
    }
}
