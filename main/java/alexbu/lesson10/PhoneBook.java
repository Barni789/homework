package alexbu.lesson10;

import java.util.*;

public class PhoneBook {
    private HashMap<String, List<String>>  phoneBook = new HashMap<>();

    public void addNewRecord (String surname, String number) {
        List<String> list = phoneBook.get(surname);
        if (list == null){
            ArrayList<String> newList = new ArrayList<>();
            newList.add(number);
            phoneBook.put(surname,newList);
        } else {
            list.add(number);
        }

    }

    public List<String> getNewName(String surname) {
        return phoneBook.get(surname);
    }
}
