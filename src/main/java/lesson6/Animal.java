package lesson6;

public class Animal {

    private static int animalsCount = 0;

    String name;
    int runLimit;
    int swimLimit;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;

        animalsCount++;
    }


    public void run(int distance) {
        if (distance <= runLimit && distance > 0) {
            System.out.println(name + " пробежал " + distance + " метров.");
        } else {
            System.out.println(name + " не может бежать " + distance + " метров.");
        }

    }

    public void swim(int distance) {
        if (distance <= swimLimit && distance > 0) {
            System.out.println(name + " проплыл " + distance + " метров.");
        }
        else {
            System.out.println(name + " не может плыть " + distance + " метров.");
        }

    }

    public static int getAnimalsCount() {
        return animalsCount;
    }
}
