package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    List<String> phoneBook = new ArrayList<>();

    public int add(String name, String phoneNumber){
        String contact = name + " - " + phoneNumber;
        if(!phoneBook.contains(contact)) {
            phoneBook.add(contact);
        }
        return phoneBook.size();
    }
}
