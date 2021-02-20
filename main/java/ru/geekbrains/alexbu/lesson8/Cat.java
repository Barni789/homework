package ru.geekbrains.alexbu.lesson8;

public class Cat implements Player {
    private int maxLength;
    private int maxHeight;
    private boolean attempt = true;
    private String name;

    public Cat(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    public String run() {
        return name + ": максимальная дистанция бега - " + maxLength;
    }
    public String jump() {
        return name + ": максимальная высота прыжка - " + maxHeight;
    }

    public String getName() {
        return name;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public boolean getAttempt() {
        return attempt;
    }

    public void setAttempt(boolean attempt) {
        this.attempt = attempt;
    }
}
