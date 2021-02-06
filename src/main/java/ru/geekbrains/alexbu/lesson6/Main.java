package ru.geekbrains.alexbu.lesson6;
public class Main {
    public static void main(String[] args)  {

        double distanceRun = 340;
        double distanceSwim = 9;
        Animal cat = new Cat("Барсик",200, 0);
        Animal dog = new Dog("Бобик",500,10);
        System.out.println("Бег :\n");
        if (cat.run(distanceRun)){
            System.out.println(cat.getName() + " пробежал " + distanceRun + " м.");
        } else {
            System.out.println(cat.getName() + " не смог пробежать " + distanceRun + " м.");
        }
        if (dog.run(distanceRun)){
            System.out.println(dog.getName() + " пробежал " + distanceRun + " м.");
        } else {
            System.out.println(dog.getName() + " не смог пробежать " + distanceRun + " м.");
        }

        System.out.println("Плавание :\n");
        if (cat.swim(distanceSwim)){
            System.out.println(cat.getName() + " проплыл" + distanceSwim + " м.");
        } else {
            System.out.println(cat.getName() + " не смог проплыть " + distanceSwim + " м.Не умеет плавать");
        }
        if (dog.swim(distanceSwim)){
            System.out.println(dog.getName() + " проплыл " + distanceSwim + " м.");
        } else {
            System.out.println(dog.getName() + " не смог проплыть  " + distanceSwim + " м.");
        }

    }
}

