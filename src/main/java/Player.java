import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand = new ArrayList<>();

    public void dealHand(Deck deck){
        for( int i = 0; i < 4; i++){
            Card card = deck.getRandomCard();
            hand.add(card);
        }
    }

    public void printHand(){
        System.out.println("Hand:");
        hand.forEach( card -> {
            System.out.print(card.rank + "-" + card.suite +"   ");
        });
        System.out.println();
    }
}
