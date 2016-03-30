package br.unicap.cardgame.model;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    
    /**
     * 
     * @return 3 cartas randomicas
     */
    public static List<Card> randonCards() {
        return staticCards().subList(0, 2);
    }
    
    private static List<Card> staticCards() {
        
        Card card1 = new Card(1);
        Card card2 = new Card(2);
        Card card3 = new Card(3);
        Card card4 = new Card(1);
        Card card5 = new Card(2);
        Card card6 = new Card(3);
        
        
        List<Card> all = new ArrayList<>();
        all.add(card1);
        all.add(card2);
        all.add(card3);
        all.add(card4);
        all.add(card5);
        all.add(card6);
        
        return all;      
        
    }
}
