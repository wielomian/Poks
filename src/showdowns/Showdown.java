package showdowns;

/**
 * Created by user on 2017-11-09.
 */
public interface Showdown {

        /*
        high card - 0
        pair - 1
        two pairs - 2
        three of a kind - 3
        straight - 4
        flush - 5
        full house - 6
        four of a kind - 7
        straight flush - 8
        royal flush - 9
         */
        Integer hierarchy = null;
        /*
        2 - 2
        ...
        10 - 10
        J - 11
        Q - 12
        K - 13
        A - 14
         */
        Integer highestCard = null;
        Integer lowestCard = null;

}
