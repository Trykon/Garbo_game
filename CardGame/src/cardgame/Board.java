package cardgame;
import java.util.*;
public class Board {
    public Card[][] board = new Card[4][4];
    public int[][] moves = new int[4][4];
    public int[][] taken = new int[4][4];
    public void setBoard(Board b){
        Card testcard = new Card(0,0);
        for(int i=0; i<4; i++)
        {
            for(int j=0;j<4;j++)
            {
                b.board[i][j] = testcard;
            }
        }
    }
}
