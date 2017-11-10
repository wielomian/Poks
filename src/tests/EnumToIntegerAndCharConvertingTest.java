package tests;


import poks.ShowdownsRecognizer;
import org.junit.Test;
import poks.CardGenerator;
import java.util.ArrayList;

/**
 * Created by user on 2017-11-10.
 */
public class EnumToIntegerAndCharConvertingTest {

    @Test

    public void shouldReceiveTwoArrayListsOfEnumsAndReturnOneListOfIntegersAndChars(){

        CardGenerator newCard = new CardGenerator();

        ArrayList<CardGenerator> firstList = new ArrayList<>();
        ArrayList<CardGenerator> secondList = new ArrayList<>();

        for(int i = 0; i < 5; ++i){
            newCard.getCardParameters(newCard);
            firstList.add(i, newCard);
            System.out.println("Generated card " + newCard.rank.toString() + " " + newCard.suit.toString() + " and successfully added it to the table cards.");
        }
        for(int i = 0; i < 2; ++i){
            newCard.getCardParameters(newCard);
            secondList.add(i, newCard);
            System.out.println("Generated card " + newCard.rank.toString() + " " + newCard.suit.toString() + " and successfully added it to the hand cards.");
        }

        ShowdownsRecognizer sr = new ShowdownsRecognizer();
        sr.recognizeShowdown(firstList, secondList);

    }


}
