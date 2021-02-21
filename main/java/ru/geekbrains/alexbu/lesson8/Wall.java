package ru.geekbrains.alexbu.lesson8;

public class Wall implements Hurdles {
    private  int height;

    public Wall(int height) {
        this.height = height;
    }
     public void winCheck(Player player) {
        player.jump();
        player.setAttempt(player.getMaxHeight() >= height);
        if (player.getAttempt()) {
            System.out.println("Игрок " + player.getName() + " прыгнул: " + height + " м");
        } else {
            System.out.println("Игрок " + player.getName() + " не смог прыгнуть: " + height + " м");
        }
    }
}
