package lesson8;

public class Cat implements Participant {

    private String name;
    private int runLength;
    private double jumpHeight;
    private boolean success = true;

    public Cat(String name, int runLength, double jumpHeight) {
        this.name = name;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    public String run() {
        return name + " может пробежать " + runLength + " метров";
    }

    public String jump() {
        return  name + " может прыгнуть " + jumpHeight + " метров";
    }

    public String getName() {
        return name;
    }

    public int getRunLength() {
        return runLength;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
