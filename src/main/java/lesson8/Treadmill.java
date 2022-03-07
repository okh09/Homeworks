package lesson8;

public class Treadmill implements Obstacle {

    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public String check(Participant participant) {
        participant.run();
        participant.setSuccess(participant.getRunLength() >= length);

        if (participant.getSuccess()) {

            return "Участник " + participant.getName() + " пробежал дистанцию " + length + " метров.";

        } else {
            return "Участник " + participant.getName() + " не смог пробежать дистанцию " + length + " метров.";
        }
    }
}

