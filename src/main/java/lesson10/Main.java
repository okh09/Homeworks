package lesson10;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"123", "aaa", "bbb", "ccc"};
        System.out.println(Arrays.toString(arr));
        swapElements(arr, 1,3);
        System.out.println(Arrays.toString(arr));
        swapElements(arr, 0,2);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("Задача с фруктами:");

        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox = new Box<>();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
            
        }

        for (int i = 0; i < 5; i++) {
            appleBox.add(new Apple());

        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Double orange1Weight = orangeBox1.getWeight();
        Double orange2Weight = orangeBox2.getWeight();
        Double appleWeight = appleBox.getWeight();
        System.out.println("=========================");
        System.out.println("Вес коробки 1 с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Вес коробки 2 с апельсинами: " + orangeBox2.getWeight());
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("=========================");
        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);
//        orangeBox1.moveAt(appleBox); //Error








    }

    private static <T> void swapElements(T[] arr, int index1, int index2) {
        T tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
