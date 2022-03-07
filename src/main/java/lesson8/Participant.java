package lesson8;

public interface Participant {

    String getName();
    int getRunLength();

    double getJumpHeight();
    boolean getSuccess();
    void setSuccess(boolean success);
    String run();
    String jump();

}
