package alexbu.lesson7;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Cat[] Cats = new Cat[4];
        Cats[0] = new Cat("Маркиз", 7, false);
        Cats[1] = new Cat("Том", 15, false);
        Cats[2] = new Cat("Бакс", 8, false);
        Cats[3] = new Cat("Барсик", 5, false);


        Plate plate = new Plate(55);
        plate.info();
        for (int i = 0; i < Cats.length; i++) {
            if (Cats[i].fullness == false && Cats[i].appetite < plate.food){
                Cats[i].eat(plate);
                Cats[i].fullness = true;
                System.out.println("Кот " + Cats[i].name + " поел!");
            } else {
                System.out.println("Кот " + Cats[i].name + " не поел!");
            }
        }
        int amount;
        plate.info();
        System.out.println("Сколько грамм добавить в миску?");
        amount = sc.nextInt();
        plate.increaseFood(amount);
        plate.info();

    }
}