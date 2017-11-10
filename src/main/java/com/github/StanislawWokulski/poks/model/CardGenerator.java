package com.github.StanislawWokulski.poks.poks.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 2017-11-09.
 */
public class CardGenerator {

    private static CardGenerator instance;

    private final Random random;
    private final List<Card> allPossibleCards;

    private CardGenerator() {
        random = new Random();
        allPossibleCards = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                allPossibleCards.add(new Card(rank, suit));
            }
        }
    }

    public static CardGenerator getInstance() {
        if (instance == null)
            instance = new CardGenerator();
        return instance;
    }

    public Card getRandomCard() {
        return allPossibleCards.get(random.nextInt(allPossibleCards.size()));
    }

}
