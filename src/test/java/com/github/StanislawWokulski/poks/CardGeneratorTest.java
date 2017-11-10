package java.com.github.StanislawWokulski.poks.poks;

import com.github.StanislawWokulski.poks.poks.model.Card;
import com.github.StanislawWokulski.poks.poks.model.CardGenerator;
import org.junit.Test;

/**
 * Created by user on 2017-11-09.
 */
public class CardGeneratorTest {

    @Test
    public void shouldPrintCardData() {
        CardGenerator cardGenerator = CardGenerator.getInstance();
        Card card = cardGenerator.getRandomCard();
        System.out.println("Params: " + card.getRank().toString() + " " + card.getSuit().toString());
    }

}
