public class Game {
    public static void main(String[] args){
        Deck deck = new Deck();
        Player player1 = new Player();
        Player bot = new Player();

        player1.dealHand(deck);
        player1.printHand();

        bot.dealHand(deck);

        deck.setBriscola();
        deck.printBriscola();

    }
}
