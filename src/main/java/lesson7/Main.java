package lesson7;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 25);
        Cat cat2 = new Cat("Леопольд", 20);
        Cat cat3 = new Cat("Мурзик", 30);

        Plate plate = new Plate(100, 80);

        Cat[] cats = {cat1, cat2, cat3};

        System.out.println(plate);

        // кормление кошек в первый раз
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " покушал.");
            cat.eat(plate);
            System.out.println(cat);
        }

        // добавление еды в миску
        System.out.println(plate);
        plate.addFood(40);

        // кормление кошек во второй раз
        for (Cat cat : cats) {
            cat.setSatiety(false); // кошки проголодались
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);

        }
    }
}
