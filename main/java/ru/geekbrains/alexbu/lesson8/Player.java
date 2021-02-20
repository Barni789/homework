package ru.geekbrains.alexbu.lesson8;

public interface Player {
    String getName();

    int getMaxLength();

    int getMaxHeight();

    boolean getAttempt();

    void setAttempt(boolean attempt);

    String run();

    String jump();
}
