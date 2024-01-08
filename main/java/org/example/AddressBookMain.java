package org.example;
import java.util.Map;
import java.util.Scanner;

import java.util.*;

/**
 * The AddressBookMain class contains methods to manage contacts in an address book.
 */
public class AddressBookMain {

    /**
     * Method to add a new contact to the address book.
     *
     * @param a The AddressBook object where the contact will be added.
     */
    public void AddContact(AddressBook a) {
        Scanner sc = new Scanner(System.in);

        // Get user input for contact details
        System.out.println("Enter first name");
        String firstName = sc.next();

        // Check if a contact with the same first name already exists
        if (a.hm.values().stream().noneMatch(contact -> contact.getFirstName().equalsIgnoreCase(firstName))) {
            System.out.println("Enter last name");
            String lastName = sc.next();
            System.out.println("Enter address");
            String address = sc.next();
            System.out.println("Enter city");
            String city = sc.next();
            System.out.println("Enter state");
            String state = sc.next();
            System.out.println("Enter zip code");
            String zipCode = sc.next();
            System.out.println("Enter phone number");
            String phoneNumber = sc.next();
            System.out.println("Enter email");
            String email = sc.next();

            // Create a new contact and add it to the address book
            Contact contact1 = new Contact(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
            a.hm.put(firstName, contact1);
            a.hm.put(city, contact1);
            a.hm.put(state, contact1);
        } else {
            System.out.println("Same user found");
        }
    }
    /**
     * Method to display all contacts in the address book.
     *
     * @param a The AddressBook object to display contacts from.
     */
    public void Display(AddressBook a) {
        for (Map.Entry<String, Contact> entry : a.hm.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    /**
     * Method to edit an existing contact in the address book.
     *
     * @param a The AddressBook object where the contact will be edited.
     */
    public void EditContact(AddressBook a) {
        for (Map.Entry<String, Contact> entry : a.hm.entrySet()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first name you want to edit");
            String firstNameToEdit = sc.next();
            System.out.println("Enter last name you want to edit");
            String lastNameToEdit = sc.next();
            Contact contact = entry.getValue();

            // Check if the contact details match the input for editing
            if (contact.getFirstName() != null && contact.getFirstName().equals(firstNameToEdit)
                    && contact.getLastName().equals(lastNameToEdit)) {
                // Get new contact details from the user
                System.out.println("Enter contact's new first name");
                String newFirstName = sc.next();
                System.out.println("Enter contact's new last name");
                String newLastName = sc.next();
                System.out.println("Enter contact's new address");
                String newAddress = sc.next();
                System.out.println("Enter contact's new city");
                String newCity = sc.next();
                System.out.println("Enter contact's new state");
                String newState = sc.next();
                System.out.println("Enter contact's new zipCode");
                String newZipCode = sc.next();
                System.out.println("Enter contact's new phoneNumber");
                String newPhoneNumber = sc.next();
                System.out.println("Enter contact's new email");
                String newEmail = sc.next();

                // Update the contact details
                contact.setFirstName(newFirstName);
                contact.setLastName(newLastName);
                contact.setAddress(newAddress);
                contact.setCity(newCity);
                contact.setState(newState);
                contact.setZipCode(newZipCode);
                contact.setPhoneNumber(newPhoneNumber);
                contact.setEmail(newEmail);
            } else {
                System.out.println("Contact details not found");
            }
        }
    }

    /**
     * Method to delete a contact from the address book.
     *
     * @param a The AddressBook object where the contact will be deleted.
     */
    public void DeleteContacts(AddressBook a) {
        for (Map.Entry<String, Contact> entry : a.hm.entrySet()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first name you want to delete");
            String firstNameToDelete = sc.next();
            Contact contact = entry.getValue();

            // Check if the contact with the specified first name exists
            if (contact.getFirstName() != null && contact.getFirstName().equals(firstNameToDelete)) {
                // Remove the contact from the address book
                a.hm.remove(firstNameToDelete);
                System.out.println("Delete operation is successfully done");
                break;
            }
        }
    }
}

