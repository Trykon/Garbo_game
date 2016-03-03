package cardgame;
import java.util.*;
public class Deck {
    public Card[] deck = new Card[32];
    
    public void start(Board b, Deck d, Player p) {
        b.setBoard(b);
        setDeck(d);
        shuffleDeck(d);
        deal14(p,d);
    }
    
    public void setDeck(Deck d){
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<8;j++)
            {
                d.deck[((i*8)+j)]= new Card((i+1),(j+5));
                //System.out.println(deck[((i*8)+j)].toString() + " " + i + " " + j);
            }
        }    
    }
    
    public void shuffleDeck(Deck d){
        Card k = new Card(0,0);
        for(int i=0;i<32;i++)
        {
            k=d.deck[i];
            int j;
            j = (int) Math.floor(Math.random()* (32-i) + i);
            d.deck[i]=d.deck[j];
            d.deck[j]=k;
        }
    }
    
    public void deal14 (Player p, Deck d){
        for(int i=0; i<8; i+=2)
        {
            p.humanhand.add(d.deck[i]);
            p.comhand.add(d.deck[i+1]);
        }
    }
    
    public void deal28(Player p, Deck d){

        for(int i=8;i<24;i+=2)
        {
            p.humanhand.add(d.deck[i]);
            p.comhand.add(d.deck[i+1]);
        }
    }
    public void deal34(Player p, Deck d){

        for(int i=24;i<32;i+=2)
        {
            p.humanhand.add(d.deck[i]);
            p.comhand.add(d.deck[i+1]);
        }
    }
}
