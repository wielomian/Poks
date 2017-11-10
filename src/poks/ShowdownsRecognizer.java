package poks;
import showdowns.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 2017-11-09.
 */
public class ShowdownsRecognizer {

    public void recognizeShowdown(ArrayList<CardGenerator> tableCards, ArrayList<CardGenerator> handCards){

        ArrayList<CardGenerator> allCards = new ArrayList<CardGenerator>();

        allCards.addAll(tableCards);
        allCards.addAll(handCards);

        Map<String, Integer> EnumToIntConverter = new HashMap<String, Integer>();
        EnumToIntConverter.put("TWO", 2);
        EnumToIntConverter.put("THREE", 3);
        EnumToIntConverter.put("FOUR", 4);
        EnumToIntConverter.put("FIVE", 5);
        EnumToIntConverter.put("SIX", 6);
        EnumToIntConverter.put("SEVEN", 7);
        EnumToIntConverter.put("EIGHT", 8);
        EnumToIntConverter.put("NINE", 9);
        EnumToIntConverter.put("TEN", 10);
        EnumToIntConverter.put("JACK",11);
        EnumToIntConverter.put("QUEEN", 12);
        EnumToIntConverter.put("KING", 13);
        EnumToIntConverter.put("ACE", 14);

        List<ConcreteCard> Set = new ArrayList<ConcreteCard>();

        for(int i = 0; i < allCards.size(); ++i ){

            Set.add(new ConcreteCard(EnumToIntConverter.get((allCards.get(i).rank.toString())), allCards.get(i).suit.toString().charAt(0)));
        }
        for(ConcreteCard concretecard : Set){
            System.out.println(concretecard);
        }

    }



}


