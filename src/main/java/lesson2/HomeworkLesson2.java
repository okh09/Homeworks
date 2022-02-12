package lesson2;

public class HomeworkLesson2 {

    public static void main(String[] args) {
        System.out.println(isBoolean(5, 6));
        isPositiveOrNegative(-1);
        System.out.println(isNegative(5));
        printWord("Hello", 5);
        System.out.println(leapYearOrNot(2022));


    }

    public static boolean isBoolean(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число" + x + " положительное");
        } else {
            System.out.println(("Число " + x + " отрицательное"));
        }
    }

    public static boolean isNegative(int a) {
        return (a < 0);
    }

    public static void printWord(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static boolean leapYearOrNot(int y) {
        boolean isTrue = true;
        boolean isFalse = false;

        if (y % 400 == 0) {
            return isTrue;
        } else if ((y % 4 == 0) && (y % 100 != 0)) {
            return isTrue;
        } else {
            return isFalse;
        }
    }
}
