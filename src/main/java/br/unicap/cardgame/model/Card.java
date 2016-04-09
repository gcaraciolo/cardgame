package br.unicap.cardgame.model;

public class Card {
    
    private int attack;
    private int defense;
    private int life;
    private Subject subject;

    public Card(int attack, int defense, int life, Subject subject) {
        this.attack = attack;
        this.defense = defense;
        this.life = life;
        this.subject = subject;
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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return  "{" 
                    + "attack:" + attack + ","
                    + "defense:" + defense + ","
                    + "life:" + life + ","
                    + "subject:" + subject 
                + "}";
    }
    

}
