package alexbu.lesson7;

public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int a) {
        food -= a;
    }
    public void increaseFood(int b) {
        food += b;
    }
    public void info() {
        System.out.println("Всего еды: " + food);
    }
}