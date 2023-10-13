public class GameLogic {

    public static Card findStrongerCard(Card briscola, Card playerCard, Card botCard, boolean playerWin, boolean botWin){

        Card winningCard = new Card();

        if((playerCard.getSuite() == briscola.getSuite()) && (botCard.getSuite() == briscola.getSuite())) {
            winningCard = playerCard.getStrenght() > botCard.getStrenght() ? playerCard : botCard;
        } else if ((playerCard.getSuite() == briscola.getSuite()) && (botCard.getSuite() != briscola.getSuite())) {
            winningCard = playerCard;
        } else if ((playerCard.getSuite() != briscola.getSuite()) && (botCard.getSuite() == briscola.getSuite())) {
            winningCard = botCard;
        } else {
            if(playerCard.getSuite() == botCard.getSuite()) {
                winningCard = playerCard.getStrenght() > botCard.getStrenght() ? playerCard : botCard;
            } else{
                winningCard = playerWin ? playerCard : botCard;
            }
        }

        return winningCard;
    }

    public static void winner(Player player, Player bot){
        if(player.getPoints() > bot.getPoints()){
            System.out.println("CONGRATULATIONS, YOU ARE A WINNER. - PTS: " + player.getPoints());
        } else if (player.getPoints() < bot.getPoints()) {
            System.out.println("LOSER! - PTS: " + player.getPoints());
        } else {
            System.out.println("! DRAW ! - PTS: " + player.getPoints());
        }
    }

}
