package poks;

import java.util.Random;

/**
 * Created by user on 2017-11-09.
 */
public class CardGenerator {

    public enum Suits{
        HEARTS, TILES, CLOVERS, PIKES;
    }

    public enum Ranks{
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    }

    public Suits suit;
    public Ranks rank;

    public void getCardParameters(CardGenerator cardGenerator){
        cardGenerator.suit = Suits.values()[new Random().nextInt(Suits.values().length)];
        cardGenerator.rank = Ranks.values()[new Random().nextInt(Ranks.values().length)];
        }

}
