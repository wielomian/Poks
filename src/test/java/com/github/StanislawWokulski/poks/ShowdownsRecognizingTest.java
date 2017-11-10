package java.com.github.StanislawWokulski.poks.poks;


import com.github.StanislawWokulski.poks.poks.model.Card;
import com.github.StanislawWokulski.poks.poks.model.CardGenerator;
import com.github.StanislawWokulski.poks.poks.service.ShowdownsRecognizer;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by user on 2017-11-10.
 */
public class ShowdownsRecognizingTest {

    @Test

    public void shouldReceiveTwoArrayListsWithCardsAndRecognizeShowdown() {

        ArrayList<Card> firstList = new ArrayList<>();
        ArrayList<Card> secondList = new ArrayList<>();
        CardGenerator cardGenerator = CardGenerator.getInstance();

        for (int i = 0; i < 5; ++i) {
            Card randomCard = cardGenerator.getRandomCard();
            firstList.add(i, randomCard);
            System.out.println("Generated card " + randomCard.getRank()
                    + " " + randomCard.getSuit() + " and successfully added it to the table cards."
            );
        }
        for (int i = 0; i < 2; ++i) {
            Card randomCard = cardGenerator.getRandomCard();
            secondList.add(i, randomCard);
            System.out.println("Generated card " + randomCard.getRank()
                    + " " + randomCard.getSuit() + " and successfully added it to the hand cards."
            );
        }

        ShowdownsRecognizer sr = new ShowdownsRecognizer();
        sr.recognizeShowdown(firstList, secondList);
    }

}
