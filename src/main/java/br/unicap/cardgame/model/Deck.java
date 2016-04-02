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
        
        //card 1
        List<Answer> a1 = createPossibleAnswer("resp1", "resp2", "resp3", "resp4");
        Question q1 = new Question(0, "questionText", a1, a1.get(0));
        Subject s1 = new Subject(0, "Math", q1);
        Card c1 = new Card(0, 0, 0, s1);
        
        //card 2
        List<Answer> a2 = createPossibleAnswer("resp1", "resp2", "resp3", "resp4");
        Question q2 = new Question(0, "questionText", a2, a2.get(1));
        Subject s2 = new Subject(0, "Math", q2);
        Card c2 = new Card(0, 0, 0, s2);
        
        List<Card> all = new ArrayList<>();
       
        all.add(c1);
        all.add(c2);
        
        return all;      
        
    }
    
    private static List<Answer> createPossibleAnswer(String option1, String option2, 
            String option3, String option4) {
        Answer answer = new Answer(0, option1);
        Answer answer1 = new Answer(1, option2);
        Answer answer2 = new Answer(2, option3);
        Answer answer3 = new Answer(3, option4);
        List<Answer> possibleAnswer = new ArrayList<>();
        possibleAnswer.add(answer);
        possibleAnswer.add(answer1);
        possibleAnswer.add(answer2);
        possibleAnswer.add(answer3);
        return possibleAnswer;
    } 
   
}
