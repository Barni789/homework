package ru.geekbrains.alexbu.lesson8;

public class Runtrack implements Hurdles {
    private  int length;

    public Runtrack(int length) {
        this.length = length;
    }

    public String winCheck(Player player) {
        player.run();
        player.setAttempt(player.getMaxLength() >= length);
        if (player.getAttempt()) {
            return "Игрок " + player.getName() + " пробежал: " + length;
        } else {
            return "Игрок " + player.getName() + " не смог пробежать: " + length;
        }
    }
}
