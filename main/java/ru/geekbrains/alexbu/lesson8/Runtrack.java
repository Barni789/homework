package ru.geekbrains.alexbu.lesson8;

public class Runtrack implements Hurdles {
    private  int length;

    public Runtrack(int length) {
        this.length = length;
    }

   public void winCheck(Player player) {
        player.run();
        player.setAttempt(player.getMaxLength() >= length);
        if (player.getAttempt()) {
            System.out.println("Игрок " + player.getName() + " пробежал: " + length + " м");
        } else {
            System.out.println("Игрок " + player.getName() + " не смог пробежать: " + length + " м");
        }
    }
}
