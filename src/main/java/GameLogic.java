public class GameLogic {
    private boolean winConditionMet = false;

    public void setWinConditionMet(boolean winConditionMet) {
        this.winConditionMet = winConditionMet;
    }

    public boolean getWinConditionMet(){
        return this.winConditionMet;
    }

    public Card findStrongerCard(Card briscola, Card playerCard, Card botCard){

        Card winningCard = new Card();

        if((playerCard.getSuite() == briscola.getSuite()) && (botCard.getSuite() == briscola.getSuite())) {
            winningCard = playerCard.getStrenght() > botCard.getStrenght() ? playerCard : botCard;
        } else if ((playerCard.getSuite() == briscola.getSuite()) && (botCard.getSuite() != briscola.getSuite())) {
            winningCard = playerCard;
        } else if ((playerCard.getSuite() != briscola.getSuite()) && (botCard.getSuite() == briscola.getSuite())) {
            winningCard = botCard;
        } else {
            winningCard = playerCard.getStrenght() > botCard.getStrenght() ? playerCard : botCard;
        }

        return winningCard;
    }
}
