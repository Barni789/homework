package alexbu.lesson7;

public class Cat {
    public String name;
    public int appetite;
    public boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.fullness = fullness;
        this.appetite = appetite;

    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}