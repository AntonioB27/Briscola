public class Game {
    public static void main(String[] args){
        GameLogic gl = new GameLogic();
        Deck deck = new Deck();
        Player player1 = new Player();
        Player bot = new Player();

        player1.dealHand(deck);
        player1.printHand();

        bot.dealHand(deck);

        deck.setBriscola();

        Card playerCard = new Card();
        Card botCard = new Card();
        Card winningCard = new Card();

        while(!gl.getWinConditionMet()){
            player1.printHand();
            deck.printBriscola();
            playerCard = player1.getCard();
            botCard = bot.getRandomCard();

            winningCard = GameLogic.findStrongerCard(deck.getBriscola(), playerCard, botCard);
            Card.printWinningCard(playerCard,botCard,winningCard);

            player1.drawCard(deck);
            bot.drawCard(deck);
        }
    }
}
