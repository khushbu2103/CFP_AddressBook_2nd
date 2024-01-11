package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The AddressBook class represents a collection of contacts and is used for organizing and managing contact information.
 */
public class AddressBook {
    // The name of the address book
    String name;

    // HashMap to store contacts, where the key is the contact's first name
    HashMap<String, Contact> contactMap = new HashMap<>();
    HashMap<String, Contact> cityMap = new HashMap<>();
    HashMap<String , Contact> stateMap = new HashMap<>();

    /**
     * Constructs an AddressBook with a specified name.
     *
     * @param name The name of the address book.
     */
    public AddressBook(String name) {
        this.name = name;
    }
    List<Contact> sortContactsByPerson() {
        return contactMap.values().stream()
                .sorted(Comparator.comparing(Contact::getFirstName))
                .collect(Collectors.toList());
    }
    List<Contact> sortContactsByCity() {
        return contactMap.values().stream()
                .sorted(Comparator.comparing(Contact::getFirstName))
                .collect(Collectors.toList());
    }
    List<Contact> sortContactsByState() {
        return contactMap.values().stream()
                .sorted(Comparator.comparing(Contact::getFirstName))
                .collect(Collectors.toList());
    }
    List<Contact> sortContactsByZip() {
        return contactMap.values().stream()
                .sorted(Comparator.comparing(Contact::getFirstName))
                .collect(Collectors.toList());
    }
}
