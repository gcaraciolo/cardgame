package br.unicap.cardgame.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {
    
    public static List<Card> cards = staticCards();
    
    
    public static List<Card> randonCards() {
        int rand = ThreadLocalRandom.current().nextInt(0, cards.size());
        int rand1 = ThreadLocalRandom.current().nextInt(0, cards.size());
        int rand2 = ThreadLocalRandom.current().nextInt(0, cards.size());
        
        List<Card> randon = new ArrayList<>();
        randon.add(cards.get(rand));
        randon.add(cards.get(rand1));
        randon.add(cards.get(rand2));
        
        return randon;
    }
    
    public static Card randonCard() {
        int rand = ThreadLocalRandom.current().nextInt(0, cards.size());
        return cards.get(rand);
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
