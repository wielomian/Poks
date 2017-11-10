package poks;
import showdowns.*;

import java.util.*;

/**
 * Created by user on 2017-11-09.
 */
public class ShowdownsRecognizer {

    public void recognizeShowdown(ArrayList<CardGenerator> tableCards, ArrayList<CardGenerator> handCards){

        List<CardGenerator> allCards = new ArrayList<CardGenerator>(tableCards);
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

        List<ConcreteCard> Set = new ArrayList<>();

        for(int i = 0; i < allCards.size(); ++i){

            Integer rank = EnumToIntConverter.get(allCards.get(i).rank.toString());
            char suit = allCards.get(i).suit.toString().charAt(0);
            ConcreteCard card = new ConcreteCard(rank, suit);

            Set.add(card);
        }
        Collections.sort(Set);
        // Set is an arraylist created from two input lists of cards on hand and on table
        // In that point Set contains list of ConcreteCards - which contain an Integer and a char

        for (int i = 0; i < Set.size(); ++i){
            System.out.print(Set.get(i).rank + " ");
            System.out.println(Set.get(i).suit);
        }

    }



}


