package alexbu.lesson10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Head");
        words.add("Hair");
        words.add("Eyes");
        words.add("Nose");
        words.add("Dog");
        words.add("Black");
        words.add("Water");
        words.add("Tea");
        words.add("Cat");
        words.add("Sugar");
        words.add("Hair");
        words.add("Milk");
        words.add("Nose");
        words.add("Dog");
        words.add("Black");
        words.add("Meat");
        words.add("Meat");
        words.add("Meat");
        uniqueWords(words);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addNewRecord("Petrov","777556846");
        phoneBook.addNewRecord("Ivanov","458685668");
        phoneBook.addNewRecord("Petrov","333356998");
        phoneBook.addNewRecord("Sidorov","755856558");
        System.out.println(phoneBook.getNewName("Petrov"));
        System.out.println(phoneBook.getNewName("Sidorov"));
        System.out.println(phoneBook.getNewName("Ivanov"));
    }

    private static void uniqueWords(List<String> words) {
        HashMap<String,Integer> element = new HashMap<>();
        for (String i : words) {
            Integer count = element.get(i);
            if (count == null) {
                element.put(i, 1);
            } else
                element.put(i, count + 1);

        }
        System.out.println(element);
    }
}
