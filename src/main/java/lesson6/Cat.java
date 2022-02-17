package lesson6;

public class Cat extends Animal {

    private static int catsCount = 0;


    public Cat(String name, int runLimit) {
        super(name, runLimit, -1);

        catsCount++;
    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public static int getCatsCount() {
        return catsCount;
    }
}
