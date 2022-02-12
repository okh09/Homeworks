package lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeworkLesson4 {

    private static final int SIZE = 9;
    private static final int WIN_SIZE = 4;
    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'x';
    private static final char DOT_AI = 'o';
    private static final String SPACE = " ";
    private static final String HEADER_SYMBOL = "✶";
    private static char[][] map;
    private static int turnsCount;

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        turnGame();
    }

    private static void turnGame() {
        do {
            System.out.println("Игра начинается!");
            init();
            printMap();
            playGame();
        } while (isContinueGame());
        endGame();
    }
    private static void init() {
        turnsCount = 0;
        map = new char[SIZE][SIZE];
        initMap();
    }

    private static void playGame() {
        while (true) {
            turnHuman();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            turnAI();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        System.out.print(HEADER_SYMBOL + SPACE);
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + SPACE);
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + SPACE);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + SPACE);
            }
            System.out.println();
        }
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("Вы победили!");
            } else {
                System.out.println("ИИ победил!");
            }
            return true;
        }

        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static boolean checkDraw() {
        return turnsCount >= SIZE * SIZE;
    }

    private static boolean checkWin(char symbol) {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                for (int dx = -1; dx < 2; dx++) {
                    for (int dy = -1; dy < 2; dy++) {
                        if (checkLine(x, y, dx, dy, symbol) == WIN_SIZE)
                            return true;
                    }
                }
            }
        }
        return false;
    }

    private static int checkLine(int x, int y, int dx, int dy, char symbol) {
        int n = 0;
        if (dx == 0 && dy == 0)
            return 0;
        for (int i = 0, xi = x, yi = y; i < WIN_SIZE; i++, xi += dx, yi += dy)
            if (xi >= 0 && yi >= 0 && xi < SIZE && yi < SIZE && map[xi][yi] == symbol)
                n++;
        return n;
    }

    private static void turnAI() {
        System.out.println("Ход компьютера");

        int x, y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);

        } while (!isCellFree(x, y));

        map[x][y] = DOT_AI;
        turnsCount++;

    }


    private static void turnHuman() {
        System.out.println("Ход человека");

        int x, y;

        while (true) {

            x = getValidNumberFromUser() - 1;
            y = getValidNumberFromUser() - 1;

            if (isCellFree(x, y)) {
                break;
            }
        }

        map[x][y] = DOT_HUMAN;
        turnsCount++;

    }

    private static boolean isCellFree(int x, int y) {
        return map[x][y] == DOT_EMPTY;
    }

    private static int getValidNumberFromUser() {
        while (true) {
            System.out.print("Введите координату (1-" + SIZE + "): ");
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (isNumberValid(n)) {
                    return n;
                }
                System.out.println("\nДопускается числа от 1 до " + SIZE);
            } else {
                scanner.next();
                System.out.println("Допускается только целые числа");
            }
        }

    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= SIZE;
    }

    private static boolean isContinueGame() {
        System.out.println("Хотите сыграть еще? y\\n");
        return switch (scanner.next()) {
            case "y", "yes", "ok", "да" -> true;
            default -> false;
        };
    }

    private static void endGame() {
        scanner.close();
        System.out.println("Игра законцена");
    }
}
