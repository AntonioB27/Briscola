public class Game {
    public static void main(String[] args){
        Deck deck = new Deck();
        deck.printDeck();
        Player player1 = new Player();

        player1.dealHand(deck);
        player1.printHand();

        deck.printDeck();
    }
}
