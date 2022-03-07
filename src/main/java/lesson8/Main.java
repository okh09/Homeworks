package lesson8;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Геннадий",100, 1.2);
        Cat cat = new Cat("Барсик",30, 0.5);
        Robot robot = new Robot("Оптимус",50, 0);

        Wall wall = new Wall(0.5);
        Treadmill treadmill = new Treadmill(100);

        Participant[] participants = {human, cat, robot};
        Obstacle[] obstacles = {treadmill, wall};

        for (int i = 0; i < obstacles.length; i++) {
            for (Participant participant : participants) {
                if(participant.getSuccess())
                    obstacles[i].check(participant);
            }
        }
    }
}