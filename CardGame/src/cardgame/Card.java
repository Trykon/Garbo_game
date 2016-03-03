package cardgame;
public class Card {
    
    private int suit;
    private int rank;
    
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    @Override
    public String toString(){
        return "Suit: "+ suit +" Rank: "+ rank;
    }
    public int emptyCheck(){
        if(suit == 0 && rank == 0)
        return 0;
        else
            return 1;
    }
}
