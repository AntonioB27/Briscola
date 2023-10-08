import java.lang.reflect.Array;
import java.util.*;

public class Deck extends Card {

    private List<Card> deck = new ArrayList<>();

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
        int deck_size = deck.size();
        int random_num = random.nextInt(deck_size - 1);

        Card card = deck.get(random_num);
        deck.remove(random_num);
        return card;
    }
}
