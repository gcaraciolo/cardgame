package br.unicap.cardgame.model;

public class Card {
    
    private int type;
     
    public Card(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public void doAction(Char character) {
        switch(type) {
            case 1: 
                character.increaseAttack(10);
                break;
            case 2:
                character.increaseDefense(10);
                break;                
            case 3: 
                character.increaseLife(10);
                break;                
            default:                
                break;
        }
                
    }
}
