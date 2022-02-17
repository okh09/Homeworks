package lesson6;

public class Dog extends Animal {

    private static int dogsCount = 0;

    public Dog(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);

        dogsCount++;
    }

    public static int getDogsCount() {
        return dogsCount;
    }
}
