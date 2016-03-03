package cardgame;
import java.util.*;
public class CardGame {
    public static void main(String[] args) {
        Board b = new Board();
        Player p = new Player();
        Deck d = new Deck();
        GamePhases g = new GamePhases();
        d.start(b, d, p);
        g.firstphase(b, d, p, g);
        g.secondphase(b, d, p, g);
        
    }
}
