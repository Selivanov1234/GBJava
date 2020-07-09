package homeworkfour;

import java.util.Random;
import java.util.Scanner;

public class XOGame {

    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
       gameIntro();
       playGame();
       System.out.println("Game over!");
    }
    public static void gameIntro () {
        initMap();
        printMap();
    }
    public static void playGame () {
        if (Math.random() > 0.5) {
            System.out.println("Human goes first!");
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("You Win!");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Draw");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("You lose!");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Draw");
                    break;
                }
            }
        } else {
            System.out.println("AI goes first!");
            while (true) {
                aiTurn();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("You lose!");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Draw");
                    break;
                }
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("You Win!");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Draw");
                    break;
                }
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Your turn X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("AI makes its turn to " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static boolean checkWin(char symb) {
      // if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
      // if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
      // if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
      // if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
      // if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
      // if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
      // if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
      // if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;

        return false;
    }
}