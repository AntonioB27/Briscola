import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {
    private List<Card> hand = new ArrayList<>();
    private List<Card> wonCards = new ArrayList<>();

    public List<Card> getHand() {
        return hand;
    }

    public int getPoints() {
        return points;
    }

    private int points;

    public void addWonCards(Card card1, Card card2){
        wonCards.add(card1);
        wonCards.add(card2);
    }

    public void addPoints(Card card1, Card card2){
        this.points = points + pointCalculator(card1) + pointCalculator(card2);
    }

    private int pointCalculator(Card card){
        return switch (card.getRank()) {
            case A -> 11;
            case THREE -> 10;
            case KING -> 4;
            case QUEEN -> 3;
            case FOOL -> 2;
            case SEVEN, SIX, FIVE, FOUR, TWO -> 0;
        };
    }

    public void dealHand(Deck deck){
        for( int i = 0; i < 3; i++){
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

    public void drawCard(Deck deck){
        Card card = deck.getRandomCard();
        hand.add(card);
    }

    public Card getCard(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a card [1-3]: ");

        int cardNum = scanner.nextInt();

        while(cardNum > hand.size()){
            System.out.println("Wrong input, please select again: ");
            cardNum = scanner.nextInt();
        }

        Card card = hand.get(cardNum-1);

        hand.remove(cardNum-1);

        return card;
    }

    public Card getRandomCard(){
        Random random = new Random();
        int random_num;
        if(hand.size() != 1) {
            random_num = random.nextInt(hand.size() - 1);
        }
        else{
            random_num = 0;
        }
        Card card = hand.get(random_num);
        hand.remove(random_num);
        return card;
    }
}
