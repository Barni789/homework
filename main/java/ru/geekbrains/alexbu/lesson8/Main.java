package ru.geekbrains.alexbu.lesson8;

public class Main {
    public static void main(String[] args) {
        Player human = new Human("Павел", 45, 2);
        Player cat = new Cat("Барсик", 500, 4);
        Player robot = new Robot("Валли", 450, 1);
        Player[] players = {human, cat, robot};

        Hurdles wall1 = new Wall(90);
        Hurdles wall2 = new Wall(500);
        Runtrack runTrack1 = new Runtrack(10);
        Runtrack runTrack2 = new Runtrack(2);
        Hurdles[] hurdles = {wall1, wall2, runTrack1, runTrack2};

        for (int i = 0; i < hurdles.length; i++) {
            for (Player player : players) {
                if (player.getAttempt()) {
                    hurdles[i].winCheck(player);
                }


            }
        }
    }
}
