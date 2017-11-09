package poks;

import java.util.ArrayList;

/**
 * Created by user on 2017-11-09.
 */

public class Table {

    private ArrayList<Card> cardsOnTable = new ArrayList<>();

    public void getCard() {

        Boolean cardAdded = false;
        while (!cardAdded) {
            Card cardToBeAdded = new Card();
            cardToBeAdded.getCardParameters(cardToBeAdded);

            Boolean existsOnTable = false;

            for (Card cardToBeChecked : cardsOnTable) {

                if (cardToBeAdded.suit == cardToBeChecked.suit && cardToBeAdded.rank == cardToBeChecked.rank) {
                    existsOnTable = true;
                    System.out.println("Card already on table: " + cardToBeAdded.rank.toString() + " " + cardToBeAdded.suit.toString());
                }
            }
            if (!existsOnTable) {
                cardsOnTable.add(cardToBeAdded);
                System.out.println("Added card: " + cardToBeAdded.rank.toString() + " " + cardToBeAdded.suit.toString());
                cardAdded = true;
                }
        }
    }

    public void distributeFlop(){
        for(int i = 0; i < 3; ++i){
            getCard();
        }

    }

    public void cleanTable(){
        cardsOnTable.clear();
        System.out.println("Table cleaned!");
    }


}
