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
    public String findByNumber(String phoneNumber){
        for (String contact: phoneBook) {
            if (contact.endsWith(" - " + phoneNumber)) {
                int index = contact.indexOf("-");
                return contact.substring(0, index);
            }
        }
        return null;
    }
    public String findByName(String name){
        for (String contact : phoneBook) {
            if (contact.startsWith(name)) {
                int index = contact.indexOf(" - ");
                if (index != -1) {
                    return contact.substring(index + 2);
                }
            }
        }
        return null;
    }
}
