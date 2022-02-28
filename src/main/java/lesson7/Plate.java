package lesson7;

public class Plate {
    private int food;
    private int volume;

    public Plate(int volume, int food) {
        this.volume = volume;
        this.food = food;
    }

    public void foodInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Количество корма в миске: " + food;
    }

    public boolean decreaseFood(int n) {
        if (food < n) return false;
        food -= n;
        return true;
    }

    public void addFood(int food) {
        if (this.food + food <= volume) {
            this.food += food;
        }
    }

    public int getFood() {
        return food;
    }
}

