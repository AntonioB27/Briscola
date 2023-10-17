import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
public class Deck extends Card {

    private final List<Card> deck = new ArrayList<>();

    private Card briscola = new Card();

    public Deck(){
        setDeck();
    }

    public void setDeck() {
        for(Suites suite : Suites.values()){
            for(Ranks rank : Ranks.values()){
                deck.add(new Card(suite, rank));
            }
        }
    }


    public void printDeck() {
        for ( var card: deck) {
            System.out.println(card.getRank().toString() + ", " + card.getSuite().toString());
        }
    }

    public Card getRandomCard(){
        Random random = new Random();
        int random_num;
        if(deck.size() > 2) {
            random_num = random.nextInt(deck.size() - 2);
        } else {
            random_num = 0;
        }
        Card card = deck.get(random_num);
        deck.remove(random_num);
        return card;
    }

    public void setBriscola(){
        Random random = new Random();
        int random_num = random.nextInt(deck.size() - 1);

        Card card = deck.get(random_num);
        deck.remove(card);
        deck.add(deck.size(), card);
        this.briscola = card;
    }

    public void printBriscola(){
        System.out.println("BRISCOLA: " + briscola.getRank() + "-" + briscola.getSuite() );
    }

    public int size(){
        return this.deck.size();
    }
}
