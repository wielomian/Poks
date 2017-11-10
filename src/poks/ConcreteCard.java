package poks;

/**
 * Created by user on 2017-11-10.
 */
public class ConcreteCard implements Comparable<ConcreteCard>{

    public Integer rank;
    public char suit;

    public ConcreteCard(Integer rank, char suit){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public int compareTo(ConcreteCard cc){

        int comparedRanks = cc.rank.compareTo(rank);
        return comparedRanks;

    }
}
