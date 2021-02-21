package ru.geekbrains.alexbu.lesson8;

public class Main {
   public static void main(String[] args) {
        Player human = new Human("Павел", 450, 2);
        Player cat = new Cat("Барсик", 700, 4);
        Player robot = new Robot("Валли", 1000, 1);
        Player[] players = {human, cat, robot};

        Hurdles wall1 = new Wall(3);
        Hurdles wall2 = new Wall(5);
        Runtrack runTrack1 = new Runtrack(1005);
        Runtrack runTrack2 = new Runtrack(500);
        Hurdles[] hurdles = {wall1, wall2, runTrack1, runTrack2};

        for (int i = 0; i < hurdles.length; i++) {
            System.out.println("\nИспытание " + (i + 1));
            for (int j = 0, playersLength = players.length; j < playersLength; j++) {
                Player player = players[j];
                hurdles[i].winCheck(player);
            }
        }
    }
}
