public class Game {
    public static void main(String[] args) throws InterruptedException {
        GameLogic gl = new GameLogic();
        Deck deck = new Deck();
        Player player1 = new Player();
        Player bot = new Player();

        player1.dealHand(deck);

        bot.dealHand(deck);

        deck.setBriscola();

        Card playerCard = new Card();
        Card botCard = new Card();
        Card winningCard = new Card();
        boolean playerWin = true;
        boolean botWin = false;

        while(!player1.getHand().isEmpty()){
            player1.printHand();
            deck.printBriscola();
            if(playerWin) {
                playerCard = player1.getCard();
                botCard = bot.getRandomCard();
            }else{
                botCard = bot.getRandomCard();
                System.out.println("BOT CARD: " + botCard.getRank() + "-" + botCard.getSuite());
                playerCard = player1.getCard();
            }
            winningCard = GameLogic.findStrongerCard(deck.getBriscola(), playerCard, botCard, playerWin, botWin);
            Card.printWinningCard(playerCard,botCard,winningCard);

            if(winningCard.equals(playerCard)){
                player1.addWonCards(playerCard, botCard);
                player1.addPoints(playerCard, botCard);
                playerWin = true;
                botWin = false;
            } else{
                bot.addWonCards(playerCard, botCard);
                bot.addPoints(playerCard, botCard);
                botWin=true;
                playerWin=false;
            }

            if(deck.size() > 0) {
                if (playerWin) {
                    player1.drawCard(deck);
                    bot.drawCard(deck);
                } else {
                    bot.drawCard(deck);
                    player1.drawCard(deck);
                }
            }
        }

        GameLogic.winner(player1, bot);
    }
}
