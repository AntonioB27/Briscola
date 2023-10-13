import java.lang.reflect.Array;
import java.util.*;

public class Deck extends Card {

    private List<Card> deck = new ArrayList<>();

    private Card briscola = new Card();

    public Deck(){
        setDeck();
    }

    public void setDeck() {
        int i = 0;
        for(Suites suite : Suites.values()){
            for(Ranks rank : Ranks.values()){
                deck.add(new Card(rank, suite));
            }
        }
    }


    public void printDeck() {
        for ( var card: deck) {
            System.out.println(card.getRank().toString() + ", " + card.getSuite().toString());
        }
    }

    public List<Card> getDeck(){
        return this.deck;
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

    public Card getBriscola() {
        return briscola;
    }

    public int size(){
        return this.deck.size();
    }
}
