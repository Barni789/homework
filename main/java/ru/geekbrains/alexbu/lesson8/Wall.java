package ru.geekbrains.alexbu.lesson8;

public class Wall implements Hurdles {
    private  int height;

    public Wall(int height) {
        this.height = height;
    }
    public String winCheck(Player player) {
        player.jump();
        player.setAttempt(player.getMaxHeight() >= height);
        if (player.getAttempt()) {
            return "Игрок " + player.getName() + " прыгнул: " + height;
        } else {
            return "Игрок " + player.getName() + "не смог прыгнуть: " + height;
        }
    }
}
