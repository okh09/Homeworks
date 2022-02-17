package lesson6;

public class AnimalApp {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Бобик",500, 10 );
        Dog dog2 = new Dog("Тузик", 500, 20);
        Cat cat1 = new Cat("Мурзик", 200);
        Cat cat2 = new Cat("Барсик", 200);

        cat1.run(100);
        System.out.println();
        dog1.run(400);
        System.out.println();
        cat2.run(230);
        System.out.println();
        dog2.run(600);
        System.out.println();
        dog1.swim(7);
        System.out.println();
        cat1.swim(5);



        System.out.println();
        System.out.println("Общее количество животных: " + Animal.getAnimalsCount());
        System.out.println("Общее количество собак: " + Dog.getDogsCount());
        System.out.println("Общее количество котов: " + Cat.getCatsCount());

    }

}
