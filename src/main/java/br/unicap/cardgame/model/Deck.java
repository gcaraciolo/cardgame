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
        
        Card card1 = new Card(1, 0, 0, "Math", "2 + 2 = ?", "1", "2", "3", "4", 3);
        Card card2 = new Card(1, 0, 0, "Math", "5 * 5 = ?", "13", "27", "25", "20", 2);
        Card card3 = new Card(1, 0, 0, "Geography", "Qual a capital de pernambuco?", "Sanharó", "Recife", "Caruaru", "Salgueiro", 1);
        Card card4 = new Card(1, 0, 0, "History", "Quem era o cabeça dos nazistas?", "Adolf Hitler", "Barak Obama", "Dilma Rousseff", "Xi Jinping", 0);
        Card card5 = new Card(1, 0, 0, "History", "Quem descobriu o Brasil?", "Pedro Álvares Cabral", "Donald Trump", "Mark Zuckemberg", "Nelon Barbosa", 3);
        Card card6 = new Card(1, 0, 0, "Science", "Baleia é um?", "Peixe", "Reptil", "Mamifero", "Ave", 2);
                
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
