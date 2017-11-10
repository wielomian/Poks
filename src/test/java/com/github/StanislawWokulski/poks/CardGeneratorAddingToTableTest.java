package java.com.github.StanislawWokulski.poks.poks;

import com.github.StanislawWokulski.poks.poks.model.Table;
import org.junit.Test;

/**
 * Created by user on 2017-11-09.
 */
public class CardGeneratorAddingToTableTest {

    @Test
    public void shouldAddCardsAndAvoidRepeats() {

        Table table = new Table();

        for (int i = 0; i < 52; ++i) {
            table.getCard();
        }
        table.cleanTable();

    }

    @Test
    public void flopDistributing() {
        Table table = new Table();
        table.distributeFlop();
        table.cleanTable();
    }


}
