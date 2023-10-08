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
}
