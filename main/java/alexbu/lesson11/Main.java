package alexbu.lesson11;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer [] array = {5,8,3,9};
        System.out.println(arrayToList(array));

        changeElements(array, 1,3);
        System.out.println(arrayToList(array));

        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple(), new Apple(), new Apple());
        Box<Apple> appleBox2 = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange(),new Orange(),new Orange());

        System.out.println("Изначальный вес коробки1 яблок - " + appleBox.getWeight());
        System.out.println("Изначальный вес коробки2 яблок - " + appleBox2.getWeight());
        System.out.println("Изначальный вес коробки апельсин - " + orangeBox.getWeight());
        System.out.println("Разные коробки - " + appleBox.compare(orangeBox));
        appleBox.transferToOtherBox(appleBox2);
        System.out.println("Вес 1 коробки с яблоками после пересыпания - " + appleBox.getWeight());
        System.out.println("Вес 2 коробки с яблоками после пересыпания - " + appleBox2.getWeight());
        appleBox.addFruit(new  Apple () );
        System.out.println("Вес коробки с яблоками после добавления  - " + appleBox.getWeight());

    }

    public static <T> List<T> arrayToList(T[] array){
        return Arrays.asList(array);
    }

    public static <T>  void  changeElements(T[] array, int element1, int element2 ) {
        T element = array[element2];
        array[element2] = array[element1];
        array[element1] = element;
    }
}