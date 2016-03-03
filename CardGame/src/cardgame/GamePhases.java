package cardgame;

import java.util.*;

public class GamePhases {

    public int moveCount = 0;
    public Card chosen = new Card(0, 0);
    public int choicex = 0;
    public int choicey = 0;
    public Card under = new Card(0, 0);

    public void firstphase(Board b, Deck d, Player p, GamePhases g) {
        Scanner in = new Scanner(System.in);
        int ch1;
        int ch2;
        for (int i = 0; i < p.humanhand.size(); i++) {
            System.out.print(i + 1 + ". ");
            if (p.humanhand.get(i).getRank() == 5) {
                System.out.print("Jack of ");
            }
            if (p.humanhand.get(i).getRank() == 6) {
                System.out.print("King of ");
            }
            if (p.humanhand.get(i).getRank() == 7) {
                System.out.print("Seven of ");
            }
            if (p.humanhand.get(i).getRank() == 8) {
                System.out.print("Eight of ");
            }
            if (p.humanhand.get(i).getRank() == 9) {
                System.out.print("Nine of ");
            }
            if (p.humanhand.get(i).getRank() == 10) {
                System.out.print("Ten of ");
            }
            if (p.humanhand.get(i).getRank() == 11) {
                System.out.print("Ace of ");
            }
            if (p.humanhand.get(i).getRank() == 12) {
                System.out.print("Queen of ");
            }
            if (p.humanhand.get(i).getSuit() == 1) {
                System.out.print("Spades");
            }
            if (p.humanhand.get(i).getSuit() == 2) {
                System.out.print("Hearts");
            }
            if (p.humanhand.get(i).getSuit() == 3) {
                System.out.print("Clubs");
            }
            if (p.humanhand.get(i).getSuit() == 4) {
                System.out.print("Diamonds");
            }
            System.out.println(" " + p.humanhand.get(i).toString());
        }
        System.out.println();
        int a = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i == 0 || i == 3) && (j == 0 || j == 3)) {
                    System.out.print(" " + a + " ");
                    a++;
                } else {
                    System.out.print(" " + 0 + " ");
                }
                if (j == 3) {
                    System.out.println();
                }
            }
        }
        System.out.println("Choose card: ");
        ch1 = in.nextInt() - 1;
        System.out.println("Chose slot: ");
        ch2 = in.nextInt();
        if (ch2 == 1) {
            Card k = p.humanhand.get(ch1);
            p.humanhand.remove(ch1);
            b.board[0][0] = k;
        }
        if (ch2 == 2) {
            Card k = p.humanhand.get(ch1);
            p.humanhand.remove(ch1);
            b.board[0][3] = k;
        }
        if (ch2 == 3) {
            Card k = p.humanhand.get(ch1);
            p.humanhand.remove(ch1);
            b.board[3][0] = k;
        }
        if (ch2 == 4) {
            Card k = p.humanhand.get(ch1);
            p.humanhand.remove(ch1);
            b.board[3][3] = k;
        }
        g.checkmoves(b, g);
        g.randomMove(b, p, g);//1
        g.checkmoves(b, g);
        g.playermove(b, p, g);
        g.matchplayer(b, p, g);
        g.checkmoves(b, g);
        g.randomMove(b, p, g);//2
        g.checkmoves(b, g);
        g.playermove(b, p, g);
        g.matchplayer(b, p, g);
        g.checkmoves(b, g);
        g.randomMove(b, p, g);//3
        g.checkmoves(b, g);
        g.playermove(b, p, g);
        g.matchplayer(b, p, g);
        g.checkmoves(b, g);
        g.randomMove(b, p, g);//4
        g.checkmoves(b, g);
        d.deal28(p, d);
        g.checkmoves(b, g);
        g.playermove(b, p, g);
        g.matchplayer(b, p, g);
        g.checkmoves(b, g);
        g.randomMove(b, p, g);//5
        g.checkmoves(b, g);
        g.playermove(b, p, g);
        g.matchplayer(b, p, g);
        g.checkmoves(b, g);
        g.randomMove(b, p, g);//6
        g.checkmoves(b, g);
        g.playermove(b, p, g);
        g.matchplayer(b, p, g);
        g.checkmoves(b, g);
        g.randomMove(b, p, g);//7
        g.checkmoves(b, g);
        g.playermove(b, p, g);
        g.matchplayer(b, p, g);
        g.checkmoves(b, g);
        g.randomMove(b, p, g);//8
    }

    public void playermove(Board b, Player p, GamePhases g) {
        int ch1;
        int ch2;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < p.humanhand.size(); i++) {
            System.out.print(i + 1 + ". ");
            if (p.humanhand.get(i).getRank() == 5) {
                System.out.print("Jack of ");
            }
            if (p.humanhand.get(i).getRank() == 6) {
                System.out.print("King of ");
            }
            if (p.humanhand.get(i).getRank() == 7) {
                System.out.print("Seven of ");
            }
            if (p.humanhand.get(i).getRank() == 8) {
                System.out.print("Eight of ");
            }
            if (p.humanhand.get(i).getRank() == 9) {
                System.out.print("Nine of ");
            }
            if (p.humanhand.get(i).getRank() == 10) {
                System.out.print("Ten of ");
            }
            if (p.humanhand.get(i).getRank() == 11) {
                System.out.print("Ace of ");
            }
            if (p.humanhand.get(i).getRank() == 12) {
                System.out.print("Queen of ");
            }
            if (p.humanhand.get(i).getSuit() == 1) {
                System.out.print("Spades");
            }
            if (p.humanhand.get(i).getSuit() == 2) {
                System.out.print("Hearts");
            }
            if (p.humanhand.get(i).getSuit() == 3) {
                System.out.print("Clubs");
            }
            if (p.humanhand.get(i).getSuit() == 4) {
                System.out.print("Diamonds");
            }
            System.out.println(" " + p.humanhand.get(i).toString());
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (b.board[i][j].emptyCheck() == 1) {
                    System.out.print("(" + b.board[i][j].getSuit() + "," + b.board[i][j].getRank() + ") ");
                } else {
                    System.out.print("  " + b.moves[i][j] + "  ");
                }
                if (j == 3) {
                    System.out.println();
                }
            }
        }

        System.out.println();
        System.out.println("Your points: " + p.humanpoints + " Opponents points: " + p.compoints);
        System.out.println();
        System.out.println("Choose card: ");
        while (true) {
            ch1 = in.nextInt() - 1;
            if (ch1 >= 0 && ch1 < p.humanhand.size()) {
                break;
            } else {
                System.out.println("Given value is incorrect");
            }
        }
        System.out.println("Chose slot: ");
        while (true) {
            ch2 = in.nextInt();
            if (ch2 > 0 && ch2 <= g.moveCount) {
                break;
            } else {
                System.out.println("Given value is incorrect");
            }
        }
        System.out.println();
        Card tc = p.humanhand.get(ch1);
        g.chosen = tc;
        p.humanhand.remove(ch1);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (ch2 == b.moves[i][j]) {
                    b.board[i][j] = tc;
                    g.choicex = j;
                    g.choicey = i;
                }
            }
        }
    }

    public void matchplayer(Board b, Player p, GamePhases g) {
        int x = g.choicex;
        int y = g.choicey;
        Card tc = g.chosen;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (b.board[i][j].getSuit() == tc.getSuit()) {
                    if ((y >= i - 1 && y <= i + 1) && (x >= j - 1 && x <= j + 1)) {
                        if (!(j == x && i == y)) {
                            p.compoints += b.board[i][j].getSuit();
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (b.board[i][j].getRank() == tc.getRank()) {
                    if (x == j && y == i) {
                    } else if (x == j && y != i) {
                        p.compoints += b.board[i][j].getRank();
                    } else if (y == i && x != j) {
                        p.compoints += b.board[i][j].getRank();
                    } else if (x + 1 == j && y + 1 == i) {
                        p.compoints += b.board[i][j].getRank();
                    } else if (x + 2 == j && y + 2 == i) {
                        p.compoints += b.board[i][j].getRank();
                    } else if (x + 3 == j && y + 3 == i) {
                        p.compoints += b.board[i][j].getRank();
                    } else if (x - 1 == j && y - 1 == i) {
                        p.compoints += b.board[i][j].getRank();
                    } else if (x - 2 == j && y - 2 == i) {
                        p.compoints += b.board[i][j].getRank();
                    } else if (x - 3 == j && y - 3 == i) {
                        p.compoints += b.board[i][j].getRank();
                    } else if (x - 1 == j && y + 1 == i) {
                        p.compoints += b.board[i][j].getRank();
                    } else if (x - 2 == j && y + 2 == i) {
                        p.compoints += b.board[i][j].getRank();
                    } else if (x - 3 == j && y + 3 == i) {
                        p.compoints += b.board[i][j].getRank();
                    } else if (x + 1 == j && y - 1 == i) {
                        p.compoints += b.board[i][j].getRank();
                    } else if (x + 2 == j && y - 2 == i) {
                        p.compoints += b.board[i][j].getRank();
                    } else if (x + 3 == j && y - 3 == i) {
                        p.compoints += b.board[i][j].getRank();
                    }
                }
            }
        }
    }

    public void randomMove(Board b, Player p, GamePhases g) {
        int chr1 = (int) Math.floor(Math.random() * p.comhand.size());
        int chr2 = (int) Math.floor(Math.random() * g.moveCount + 1);
        Card tc = p.comhand.get(chr1);
        p.comhand.remove(chr1);
        int x = 0;
        int y = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (b.moves[i][j] == chr2) {
                    b.board[i][j] = tc;
                    x = j;
                    y = i;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (b.board[i][j].getSuit() == tc.getSuit()) {
                    if ((y >= i - 1 && y <= i + 1) && (x >= j - 1 && x <= j + 1)) {
                        if (!(j == x && i == y)) {
                            p.humanpoints += b.board[i][j].getSuit();
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (b.board[i][j].getRank() == tc.getRank()) {
                    if (x == j && y == i) {
                    } else if (x == j && y != i) {
                        p.humanpoints += b.board[i][j].getRank();
                    } else if (y == i && x != j) {
                        p.humanpoints += b.board[i][j].getRank();
                    } else if (x + 1 == j && y + 1 == i) {
                        p.humanpoints += b.board[i][j].getRank();
                    } else if (x + 2 == j && y + 2 == i) {
                        p.humanpoints += b.board[i][j].getRank();
                    } else if (x + 3 == j && y + 3 == i) {
                        p.humanpoints += b.board[i][j].getRank();
                    } else if (x - 1 == j && y - 1 == i) {
                        p.humanpoints += b.board[i][j].getRank();
                    } else if (x - 2 == j && y - 2 == i) {
                        p.humanpoints += b.board[i][j].getRank();
                    } else if (x - 3 == j && y - 3 == i) {
                        p.humanpoints += b.board[i][j].getRank();
                    } else if (x - 1 == j && y + 1 == i) {
                        p.humanpoints += b.board[i][j].getRank();
                    } else if (x - 2 == j && y + 2 == i) {
                        p.humanpoints += b.board[i][j].getRank();
                    } else if (x - 3 == j && y + 3 == i) {
                        p.humanpoints += b.board[i][j].getRank();
                    } else if (x + 1 == j && y - 1 == i) {
                        p.humanpoints += b.board[i][j].getRank();
                    } else if (x + 2 == j && y - 2 == i) {
                        p.humanpoints += b.board[i][j].getRank();
                    } else if (x + 3 == j && y - 3 == i) {
                        p.humanpoints += b.board[i][j].getRank();
                    }
                }
            }
        }
    }

    public void checkmoves(Board b, GamePhases g) {
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                b.moves[i][j] = 0;
                if (b.board[i][j].emptyCheck() == 0) {
                    if (i == 0 && j == 0) {
                        if (b.board[i][j + 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i + 1][j + 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i + 1][j].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i + 1][j].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        }
                    } else if (i == 0 && (j == 1 || j == 2)) {
                        if (b.board[i][j - 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i + 1][j - 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i + 1][j].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i + 1][j + 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i][j + 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        }
                    } else if (i == 0 && j == 3) {
                        if (b.board[i][j - 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i + 1][j - 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i + 1][j].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        }
                    } else if ((i == 1 || i == 2) && j == 0) {
                        if (b.board[i - 1][j].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i - 1][j + 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i][j + 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i + 1][j + 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i + 1][j].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        }
                    } else if ((i == 1 || i == 2) && (j == 1 || j == 2)) {
                        if (b.board[i - 1][j - 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i - 1][j].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i - 1][j + 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i][j - 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i][j + 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i + 1][j - 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i + 1][j].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i + 1][j + 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        }
                    } else if ((i == 1 || i == 2) && j == 3) {
                        if (b.board[i - 1][j - 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i - 1][j].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i][j - 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i + 1][j - 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i + 1][j].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        }

                    } else if (i == 3 && j == 0) {
                        if (b.board[i - 1][j].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i - 1][j + 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i][j + 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        }
                    } else if (i == 3 && (j == 1 || j == 2)) {
                        if (b.board[i - 1][j - 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i - 1][j].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i - 1][j + 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i][j - 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i][j + 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        }
                    } else if (i == 3 && j == 3) {
                        if (b.board[i - 1][j - 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i - 1][j].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        } else if (b.board[i][j - 1].emptyCheck() == 1) {
                            b.moves[i][j] = count;
                            count++;
                        }
                    }
                }
            }
        }
        g.moveCount = count - 1;
    }

    public void checkmoves2(Board b, GamePhases g) {
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                b.moves[i][j] = 0;
                if (b.taken[i][j] == 0) {
                    b.moves[i][j] = count;
                    count++;
                }
            }
        }
        g.moveCount = count - 1;
    }

    public void playermove2(Board b, Player p, GamePhases g) {
        int ch1;
        int ch2;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < p.humanhand.size(); i++) {
            System.out.print(i + 1 + ". ");
            if (p.humanhand.get(i).getRank() == 5) {
                System.out.print("Jack of ");
            }
            if (p.humanhand.get(i).getRank() == 6) {
                System.out.print("King of ");
            }
            if (p.humanhand.get(i).getRank() == 7) {
                System.out.print("Seven of ");
            }
            if (p.humanhand.get(i).getRank() == 8) {
                System.out.print("Eight of ");
            }
            if (p.humanhand.get(i).getRank() == 9) {
                System.out.print("Nine of ");
            }
            if (p.humanhand.get(i).getRank() == 10) {
                System.out.print("Ten of ");
            }
            if (p.humanhand.get(i).getRank() == 11) {
                System.out.print("Ace of ");
            }
            if (p.humanhand.get(i).getRank() == 12) {
                System.out.print("Queen of ");
            }
            if (p.humanhand.get(i).getSuit() == 1) {
                System.out.print("Spades");
            }
            if (p.humanhand.get(i).getSuit() == 2) {
                System.out.print("Hearts");
            }
            if (p.humanhand.get(i).getSuit() == 3) {
                System.out.print("Clubs");
            }
            if (p.humanhand.get(i).getSuit() == 4) {
                System.out.print("Diamonds");
            }
            System.out.println(" " + p.humanhand.get(i).toString());
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (b.taken[i][j] == 1) {
                    System.out.print("(" + b.board[i][j].getSuit() + "," + b.board[i][j].getRank() + ")* ");
                } else {
                    System.out.print("(" + b.board[i][j].getSuit() + "," + b.board[i][j].getRank() + ")" + b.moves[i][j] + " ");
                }
                if (j == 3) {
                    System.out.println();
                }
            }
        }

        System.out.println();
        System.out.println("Your points: " + p.humanpoints + " Opponents points: " + p.compoints);
        System.out.println();
        System.out.println("Choose card: ");
        while (true) {
            ch1 = in.nextInt() - 1;
            if (ch1 >= 0 && ch1 < p.humanhand.size()) {
                break;
            } else {
                System.out.println("Given value is incorrect");
            }
        }
        System.out.println("Chose slot: ");
        while (true) {
            ch2 = in.nextInt();
            if (ch2 > 0 && ch2 <= g.moveCount) {
                break;
            } else {
                System.out.println("Given value is incorrect");
            }
        }
        System.out.println();
        Card tc = p.humanhand.get(ch1);
        g.chosen = tc;
        p.humanhand.remove(ch1);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (ch2 == b.moves[i][j]) {
                    g.under = b.board[i][j];
                    b.board[i][j] = tc;
                    g.choicex = j;
                    g.choicey = i;
                    b.taken[i][j] = 1;
                }
            }
        }
    }

    public void matchplayer2(Board b, Player p, GamePhases g) {
        int x = g.choicex;
        int y = g.choicey;
        Card tc = g.chosen;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (b.taken[i][j] == 1) {
                    if (b.board[i][j].getSuit() == tc.getSuit()) {
                        if ((y >= i - 1 && y <= i + 1) && (x >= j - 1 && x <= j + 1)) {
                            if (!(j == x && i == y)) {
                                p.compoints += b.board[i][j].getSuit();
                            } else if (g.under.getSuit() == b.board[i][j].getSuit()) {
                                p.compoints += g.under.getSuit() * 10;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (b.taken[i][j] == 1) {
                    if (b.board[i][j].getRank() == tc.getRank()) {
                        if (x == j && y == i) {
                            if (g.under.getRank() == b.board[i][j].getRank()) {
                                p.compoints += g.under.getRank() * 10;
                            }
                        } else if (x == j && y != i) {
                            p.compoints += b.board[i][j].getRank();
                        } else if (y == i && x != j) {
                            p.compoints += b.board[i][j].getRank();
                        } else if (x + 1 == j && y + 1 == i) {
                            p.compoints += b.board[i][j].getRank();
                        } else if (x + 2 == j && y + 2 == i) {
                            p.compoints += b.board[i][j].getRank();
                        } else if (x + 3 == j && y + 3 == i) {
                            p.compoints += b.board[i][j].getRank();
                        } else if (x - 1 == j && y - 1 == i) {
                            p.compoints += b.board[i][j].getRank();
                        } else if (x - 2 == j && y - 2 == i) {
                            p.compoints += b.board[i][j].getRank();
                        } else if (x - 3 == j && y - 3 == i) {
                            p.compoints += b.board[i][j].getRank();
                        } else if (x - 1 == j && y + 1 == i) {
                            p.compoints += b.board[i][j].getRank();
                        } else if (x - 2 == j && y + 2 == i) {
                            p.compoints += b.board[i][j].getRank();
                        } else if (x - 3 == j && y + 3 == i) {
                            p.compoints += b.board[i][j].getRank();
                        } else if (x + 1 == j && y - 1 == i) {
                            p.compoints += b.board[i][j].getRank();
                        } else if (x + 2 == j && y - 2 == i) {
                            p.compoints += b.board[i][j].getRank();
                        } else if (x + 3 == j && y - 3 == i) {
                            p.compoints += b.board[i][j].getRank();
                        }
                    }
                }
            }
        }
    }

    public void randomMove2(Board b, Player p, GamePhases g) {
        int chr1 = (int) Math.floor(Math.random() * p.comhand.size());
        int chr2 = (int) Math.floor(Math.random() * g.moveCount + 1);
        Card tc = p.comhand.get(chr1);
        p.comhand.remove(chr1);
        int x = 0;
        int y = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (b.moves[i][j] == chr2) {
                    g.under = b.board[i][j];
                    b.board[i][j] = tc;
                    x = j;
                    y = i;
                    b.taken[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (b.taken[i][j] == 1) {
                    if (b.board[i][j].getSuit() == tc.getSuit()) {
                        if ((y >= i - 1 && y <= i + 1) && (x >= j - 1 && x <= j + 1)) {
                            if (!(j == x && i == y)) {
                                p.humanpoints += b.board[i][j].getSuit();
                            } else if (g.under.getSuit() == b.board[i][j].getSuit()) {
                                p.humanpoints += g.under.getSuit() * 10;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (b.board[i][j].getRank() == tc.getRank()) {
                    if (b.taken[i][j] == 1) {
                        if (x == j && y == i) {
                            if (g.under.getRank() == b.board[i][j].getRank()) {
                                p.humanpoints += g.under.getRank() * 10;
                            }
                        } else if (x == j && y != i) {
                            p.humanpoints += b.board[i][j].getRank();
                        } else if (y == i && x != j) {
                            p.humanpoints += b.board[i][j].getRank();
                        } else if (x + 1 == j && y + 1 == i) {
                            p.humanpoints += b.board[i][j].getRank();
                        } else if (x + 2 == j && y + 2 == i) {
                            p.humanpoints += b.board[i][j].getRank();
                        } else if (x + 3 == j && y + 3 == i) {
                            p.humanpoints += b.board[i][j].getRank();
                        } else if (x - 1 == j && y - 1 == i) {
                            p.humanpoints += b.board[i][j].getRank();
                        } else if (x - 2 == j && y - 2 == i) {
                            p.humanpoints += b.board[i][j].getRank();
                        } else if (x - 3 == j && y - 3 == i) {
                            p.humanpoints += b.board[i][j].getRank();
                        } else if (x - 1 == j && y + 1 == i) {
                            p.humanpoints += b.board[i][j].getRank();
                        } else if (x - 2 == j && y + 2 == i) {
                            p.humanpoints += b.board[i][j].getRank();
                        } else if (x - 3 == j && y + 3 == i) {
                            p.humanpoints += b.board[i][j].getRank();
                        } else if (x + 1 == j && y - 1 == i) {
                            p.humanpoints += b.board[i][j].getRank();
                        } else if (x + 2 == j && y - 2 == i) {
                            p.humanpoints += b.board[i][j].getRank();
                        } else if (x + 3 == j && y - 3 == i) {
                            p.humanpoints += b.board[i][j].getRank();
                        }
                    }
                }
            }
        }
    }

    public void decidewinner(Player p, Board b) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("(" + b.board[i][j].getSuit() + "," + b.board[i][j].getRank() + ") ");

                if (j == 3) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("Your points: " + p.humanpoints + " Opponents points: " + p.compoints);
        System.out.println();
        if (p.humanpoints > p.compoints) {
            System.out.println("You won");
        } else if (p.compoints > p.humanpoints) {
            System.out.println("Opponent won");
        } else {
            System.out.println("Draw");
        }

    }

    public void secondphase(Board b, Deck d, Player p, GamePhases g) {
        d.deal34(p, d);
        if (p.humanpoints > p.compoints) {
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
        } else {
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
            g.checkmoves2(b, g);
            g.randomMove2(b, p, g);
            g.checkmoves2(b, g);
            g.playermove2(b, p, g);
            g.matchplayer2(b, p, g);
        }
        g.decidewinner(p, b);
    }
}
