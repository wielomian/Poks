package poks;

import java.util.Random;

/**
 * Created by user on 2017-11-09.
 */
public class Card {

    public enum Suits{
        HEARTS, TILES, CLOVERS, PIKES;
    }

    public enum Ranks{
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    }

    public Suits suit;
    public Ranks rank;

    public static void getCardParameters(Card card){
        card.suit = Suits.values()[new Random().nextInt(Suits.values().length)];
        card.rank = Ranks.values()[new Random().nextInt(Ranks.values().length)];
        }

}
