package lesson8;

public class Wall implements Obstacle{

    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public String check(Participant participant) {
        participant.jump();
        participant.setSuccess(participant.getJumpHeight() >= height);

        if (participant.getSuccess()) {
            return "Участник " + participant.getName() + " перепрыгнул стену высотой " + height + " метров";
        } else {
            return "Участник " + participant.getName() + " не смог перепрыгнуть стену высотой " + height + " метров";
        }
    }
}
