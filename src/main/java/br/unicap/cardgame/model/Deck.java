package br.unicap.cardgame.model;

import br.unicap.cardgame.util.Utils;
import java.util.ArrayList;
import java.util.List;

public class Deck {
    
    public static List<Card> cards = staticCards();
        
    public static List<Card> randonCards() {
       
        List<Card> randon = new ArrayList<>();
        randon.add(cards.get(Utils.getRandomNumber(0, cards.size())));
        randon.add(cards.get(Utils.getRandomNumber(0, cards.size())));
        randon.add(cards.get(Utils.getRandomNumber(0, cards.size())));
        
        return randon;
    }
    
    public static Card randonCard() {                
        return cards.get(Utils.getRandomNumber(0, cards.size()));
    }
          
    private static List<Card> staticCards() {
        
        Card card1 = new Card(1, 0, 0);
        Card card2 = new Card(2, 0, 0);
        Card card3 = new Card(0, 1, 0);
        Card card4 = new Card(0, 2, 0);
        Card card5 = new Card(0, 0, 1);
        Card card6 = new Card(0, 0, 2);
        
        
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
