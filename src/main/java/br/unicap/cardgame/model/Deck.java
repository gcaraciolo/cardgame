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
        
        Card card1  = new Card(3, 0, 0, "Math", "2 + 2 = ?", "1", "2", "3", "4", 3);
        Card card2  = new Card(3, 0, 0, "Math", "5 * 5 = ?", "13", "27", "25", "20", 2);
        Card card3  = new Card(0, 1, 1, "Geography", "Qual a capital de pernambuco?", "Sanharó", "Recife", "Caruaru", "Salgueiro", 1);
        Card card4  = new Card(0, 1, 1, "Geography", "O satélite natual da terra é:", "Lua", "Marte", "Saturno", "Júpite", 0);
        Card card5  = new Card(0, 0, 0, "Geography", "Quantos são os movimentos da terra?", "Um", "Dois", "Três", "Quatro", 1);
        Card card6  = new Card(0, 0, 0, "Geography", "De quantas estrelas é composta a constelação do cruzeiro do sul?", "48", "5", "26", "54", 3);
        Card card7  = new Card(1, 0, 0, "History", "Quem era o cabeça dos nazistas?", "Adolf Hitler", "Barak Obama", "Dilma Rousseff", "Xi Jinping", 0);
        Card card8  = new Card(1, 0, 0, "History", "Quem descobriu o Brasil?", "Pedro Álvares Cabral", "Donald Trump", "Mark Zuckemberg", "Nelon Barbosa", 3);        
        Card card9  = new Card(0, 0, 0, "History", "Em que período o Brasil foi governado pelo presidente Itamar Franco?", "1988-1992", "1984-1988", "1990-1992", "1992-1994", 3);
        Card card10 = new Card(0, 0, 0, "History", "Quem chefiava a primeira expedição colonizadora que chegou ao Brasil em 1530?", "Martin Afonso de Souza", "Thomáz de Souza", "Pero Vaz de Caminha", "D. Pedro I", 0);
        Card card11 = new Card(0, 0, 0, "History", "Qual o primeiro produto econômico a ser explorado no Brasil?", "Milho", "Café", "Pau-brasil", "Ouro", 2);        
        Card card12 = new Card(1, 2, 0, "Science", "Baleia é um?", "Peixe", "Reptil", "Mamifero", "Ave", 2);
        Card card13 = new Card(1, 2, 0, "Science", "Qual é a maior ave?", "Pelicano", "Águia", "Avestruz", "Flamingo", 2);
        Card card14 = new Card(1, 2, 0, "Science", "Qual é o nome do macho da abelha?", "Garanhão", "Ferrão", "Rufião", "Zangão", 3);
        Card card15 = new Card(1, 2, 0, "Science", "De onde as pérolas são extraídas?", "Dos rochedos", "Das ostras", "Da terra", "Das minas", 1);
        Card card16 = new Card(1, 2, 0, "Science", "Areia é o principal elemento na fabricação de qual produto?", "Acetato", "Plástico", "Vidro", "Acrílico", 2);
        Card card17 = new Card(1, 2, 0, "Science", "O cogumelo é um: ", "Animal", "Fungo", "Planta", "Doce", 1);
        Card card18 = new Card(1, 2, 0, "Science", "Qual dos itens não faz parte do preparo do soro caseiro?", "Água", "Sal", "Açúcar", "Vinagre", 3);
        Card card19 = new Card(1, 2, 0, "Science", "A camomila é uma espécie de:", "Animal", "Vegetal", "Cor", "Pedra preciosa", 1);
        Card card20 = new Card(1, 2, 0, "Science", "Com que órgão a cobra detecta os cheiros", "Cauda", "língua", "Dentes", "Narinas", 1);
                        
        List<Card> all = new ArrayList<>();
        all.add(card1);
        all.add(card2);
        all.add(card3);
        all.add(card4);
        all.add(card5);
        all.add(card6);
        all.add(card7);
        all.add(card8);
        all.add(card9);
        all.add(card10);
        all.add(card11);
        all.add(card12);
        all.add(card13);
        all.add(card14);
        all.add(card15);
        all.add(card16);
        all.add(card17);
        all.add(card18);
        all.add(card19);
        all.add(card20);
        
        return all;      
        
    }
    
    
}
