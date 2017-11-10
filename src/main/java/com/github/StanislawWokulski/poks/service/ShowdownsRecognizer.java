package com.github.StanislawWokulski.poks.poks.service;

import com.github.StanislawWokulski.poks.poks.model.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 2017-11-09.
 */
public class ShowdownsRecognizer {

    public void recognizeShowdown(ArrayList<Card> tableCards, ArrayList<Card> handCards) {
        List<Card> allCards = new ArrayList<>(tableCards);
        allCards.addAll(handCards);
        Collections.sort(allCards);
        // allCards is an ArrayList created from two input lists of cards on hand and on table

        for (Card aSet : allCards) {
            System.out.print(aSet.getRank().getValue() + " ");
            System.out.println(aSet.getSuit());
        }

    }


}


