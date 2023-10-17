import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Card {

    public enum Suites {
        Denari, Spade, Coppe, Tressete
    }

    public enum Ranks {
        A, TWO, THREE, FOUR, FIVE, SIX, SEVEN, FOOL, QUEEN, KING
    }

    protected Suites suite;
    protected Ranks rank;

    public int getStrenght(){
        return switch (this.getRank()) {
            case A -> 10;
            case THREE -> 9;
            case KING -> 8;
            case QUEEN -> 7;
            case FOOL -> 6;
            case SEVEN -> 5;
            case SIX -> 4;
            case FIVE -> 3;
            case FOUR -> 2;
            case TWO -> 1;
        };
    }

    public static void printWinningCard(Card playerCard, Card botCard, Card winningCard) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("PLAYER CARD: " + playerCard.getRank() + "-" + playerCard.getSuite());
        Thread.sleep(1000);
        System.out.println("BOT CARD: " + botCard.getRank() + "-" + botCard.getSuite());
        Thread.sleep(1000);
        System.out.println("WINNING CARD: " + winningCard.getRank() + "-" + winningCard.getSuite());
        System.out.println();
        Thread.sleep(1000);
    }
}
