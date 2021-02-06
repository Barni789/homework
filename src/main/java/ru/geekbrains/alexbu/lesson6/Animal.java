package ru.geekbrains.alexbu.lesson6;

public class Animal {
    private double animalDistanceRun;
    private double animalDistanceSwim;
    private String name;
    Animal(String name,double animalDistanceRun, double animalDistanceSwim) {
        this.animalDistanceRun = animalDistanceRun;
        this.animalDistanceSwim = animalDistanceSwim;
        this.name = name;
    }

    public boolean run(double value) {
        return animalDistanceRun > value;
    }

    public boolean swim(double value) {
        return animalDistanceSwim >= value;
    }

    public String getName() {
        return name;
    }
}
