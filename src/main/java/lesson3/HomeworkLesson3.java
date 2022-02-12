package lesson3;

public class HomeworkLesson3 {

    public static void main(String[] args) {

        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        printArrayInConsole(arrayMeth(10, 7));
        minAndMax();
        System.out.println(checkBalance(new int[]{2, 2, 3, 4, 5, 6, 7, 3}));// true
        System.out.println(checkBalance(new int[]{1, 2, 3, 4, 5, 6, 7, 3}));// false
        modArray(new int[]{3, 4, 5, 6, 7, 8, 9}, -4);
    }


    public static void invertArray() {
        int[] array = new int[]{1, 0, 1, 1, 0, 0, 1, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) array[i] = 0;
            else array[i] = 1;

            System.out.println(array[i]);
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];

        for (int i =0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }

    }

    private static void changeArray() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;

            System.out.println(arr[i]);
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] arrayMeth(int len, int initialValue) {

        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    public static void minAndMax() {

        int[] nums = {-60, 144, 35777, -18995, 34, 864, -311, 478, -7401, 655};
        int min, max;

        min = max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("Минимальный элемент массива: " + min + "\nМаксимальный элемент массива: " + max);
    }

    public static boolean checkBalance(int[] arr) {
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < arr[i]; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];

            }
            if (leftSum == rightSum) return true;

        }
        return false;
    }

    static void modArray(int[] arr, int n) {
        System.out.print("До изменения: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("(n = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                // на право
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                // на лево
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }

        System.out.print("\nПосле изменения:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
