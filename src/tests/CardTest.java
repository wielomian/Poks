package tests;
import org.junit.Test;
import poks.Card;

/**
 * Created by user on 2017-11-09.
 */
public class CardTest {

    @Test
    public void shouldPrintCardData(){
        Card card = new Card();
        card.getCardParameters(card);
        System.out.println("Params: " + card.rank.toString() + " " + card.suit.toString());
    }

}
