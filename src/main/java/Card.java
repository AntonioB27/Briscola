import java.util.Map;

public class Card {

    public enum Suites {
        Denari, Spade, Coppe, Tressete
    }

    public enum Ranks {
        A, TWO, THREE, FOUR, FIVE, SIX, SEVEN, FOOL, QUEEN, KING
    }

    protected Suites suite;
    protected Ranks rank;

    public Card(){}

    public Card(Ranks rank, Suites suite){
        this.suite = suite;
        this.rank = rank;
    }

    public void setCard(Ranks rank, Suites suite){
            this.suite = suite;
            this.rank = rank;
    }

    public Suites getSuite() {
        return suite;
    }

    public void setSuite(Suites suite) {
        this.suite = suite;
    }

    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

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
}
