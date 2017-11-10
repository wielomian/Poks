package com.github.StanislawWokulski.poks.poks.model;

import java.util.ArrayList;

/**
 * Created by user on 2017-11-09.
 */

public class Table {

    private ArrayList<Card> cardsOnTable = new ArrayList<>();

    public void getCard() {
        Boolean cardAdded = false;
        while (!cardAdded) {
            CardGenerator cardGenerator = CardGenerator.getInstance();
            Card randomCard = cardGenerator.getRandomCard();

            //consider using set of already used cards instead
            Boolean existsOnTable = false;

            for (Card cardToBeChecked : cardsOnTable) {

                if (randomCard.equals(cardToBeChecked)) {
                    existsOnTable = true;
                    System.out.println("Card already on table: " + randomCard.getRank()
                            + " " + randomCard.getSuit()
                    );
                }
            }

            //consider retry if card already existed on the table
            if (!existsOnTable) {
                cardsOnTable.add(randomCard);
                System.out.println("Added card: " + randomCard.getRank()
                        + " " + randomCard.getSuit()
                );
                cardAdded = true;
            }
        }
    }

    public void distributeFlop() {
        for (int i = 0; i < 3; ++i) {
            getCard();
        }
    }

    public void distributeTurn() {
        getCard();
    }

    public void distributeRiver() {
        getCard();
    }

    public void cleanTable() {
        cardsOnTable.clear();
        System.out.println("Table cleaned!");
    }


}
