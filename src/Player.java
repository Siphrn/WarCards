import java.util.concurrent.ThreadLocalRandom;

public class Player {
    public Card[] cards;

    public Player(Card[] cards){
        this.cards = cards;
    }

    public Card playCard(){
        int numOfCards = this.cards.length;
        int randomNumIndex = ThreadLocalRandom.current().nextInt(0, numOfCards - 1);
        return this.cards[randomNumIndex];
    }
}
