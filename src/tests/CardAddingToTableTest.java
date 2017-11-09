package tests;
import org.junit.Test;
import poks.Card;
import poks.Table;

/**
 * Created by user on 2017-11-09.
 */
public class CardAddingToTableTest {

    @Test
    public void shouldAddCardsAndAvoidRepeats(){

        Table table = new Table();

        for(int i = 0; i < 52; ++i){
            table.getCard();
        }
        table.cleanTable();

    }

    @Test
    public void flopDistributing(){
        Table table = new Table();
        table.distributeFlop();
        table.cleanTable();
    }


}
