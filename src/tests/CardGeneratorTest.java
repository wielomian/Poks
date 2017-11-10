package tests;
import org.junit.Test;
import poks.CardGenerator;

/**
 * Created by user on 2017-11-09.
 */
public class CardGeneratorTest {

    @Test
    public void shouldPrintCardData(){
        CardGenerator cardGenerator = new CardGenerator();
        cardGenerator.getCardParameters(cardGenerator);
        System.out.println("Params: " + cardGenerator.rank.toString() + " " + cardGenerator.suit.toString());
    }

}
