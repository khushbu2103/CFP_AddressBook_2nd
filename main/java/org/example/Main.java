package org.example;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 * The Main class contains the main() method responsible for managing the address book application logic,
 * including user interactions through switch cases and calling relevant functionalities.
 */
public class Main {

    /**
     * This method is the entry point for the address book application, handling user input and invoking corresponding actions.
     * It uses switch cases to navigate through different functionalities like adding, displaying, searching, editing, and deleting contacts.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Menu options for the address book application
        // String menu = "Press \n1: Adding A contact\n2: Displaying All Contact\n3: Search by first name\n4: Search by Phone number\n5: Delete by User First name\n6: Update phone Number";

        // Scanner for user input
        Scanner sc = new Scanner(System.in);
        AddressBookMain c1 = new AddressBookMain();
        // ArrayList to store multiple address books
        ArrayList<AddressBook> arrayList2 = new ArrayList<>();

        // Creating three address books and adding them to the ArrayList
        AddressBook a = new AddressBook("Addressbook1");
        AddressBook b = new AddressBook("Addressbook2");
        AddressBook c = new AddressBook("Addressbook3");
        arrayList2.add(a);
        arrayList2.add(b);
        arrayList2.add(c);
        int z = 1;
        do {
            System.out.println("1 : Select Address Book\n2: Display all the address book\n3: Search person by citysBooks City\n4: Display all the AddressBooks State\n5: City Count\n6:state count\n7: Sort by person name");
            int option = sc.nextInt();
            switch (option)
            {
                case 1:
                    System.out.println("Enter the address book you want to search");
                    String searchAddressBook = sc.next();
                    for (AddressBook ab : arrayList2)
                    {
                        if (ab.name.equalsIgnoreCase(searchAddressBook))
                        {
                            int choice;
                            do {
                                System.out.println("Welcome to address book");
                                AddressBookMain abm = new AddressBookMain();
                                System.out.println("1. Want to add contact\n2. Want to display contact\n3. Want to edit contact\n4. Want to delete contact");
                                int input = sc.nextInt();
                                switch (input) {
                                    case 1:
                                        abm.AddContact(ab);
                                        break;
                                    case 2:
                                        abm.Display(ab);
                                        break;
                                    case 3:
                                        abm.EditContact(ab);
                                        break;
                                    case 4:
                                        abm.DeleteContacts(ab);
                                        break;
                                }
                                System.out.println("Enter 0 to exit");
                                choice = sc.nextInt();
                            } while (choice != 0);
                        }
                    }
                    break;
                case 2:
                    for (AddressBook ks : arrayList2) {
                        System.out.println(ks.name + " : " + ks.contactMap);
                    }
                    break;
                case 3:
                    System.out.println("Enter the city you want to display");
                    String city = sc.next();
                    for (AddressBook x1 : arrayList2){
                        for (Contact p : x1.contactMap.values()){
                            if(city.equalsIgnoreCase(p.getCity()))
                            {
                                System.out.println(x1.name + " : " +p);
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter the state you want to display");
                    String state = sc.next();
                    arrayList2.stream()
                            .flatMap(addressBook -> addressBook.stateMap.values().stream())
                            .filter(person -> person.getState().equalsIgnoreCase(state))
                            .forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Enter city name to count: ");
                    c1.printContactCountByCity(arrayList2);
                    String cityCount=sc.next();int countCity=0;
                    for (Map.Entry<String, Contact> entry : a.cityMap.entrySet()) {
                        Contact p = entry.getValue();
                        if (p.getCity().equalsIgnoreCase(cityCount))
                            countCity++;
                        else
                            System.out.println("None");
                    }
                    System.out.println("COUNT:-  "+countCity);
                    break;

                case 6:
                    System.out.println("Contact count by State:");
                    c1.printContactCountByState(arrayList2);
                    String stateCount=sc.next();int countstate=0;
                    for (Map.Entry<String, Contact> entry : a.stateMap.entrySet()) {
                        Contact p = entry.getValue();
                        if (p.getState().equalsIgnoreCase(stateCount))
                            countstate++;
                        else
                            System.out.println("None");
                    }
                    System.out.println("COUNT:-  "+countstate);
                    break;
                case 7:
                    c1.displayContactsSortedByPerson(a);
                    break;
                case 8:
                    c1.displayContactsSortedByCity(a);
                    break;
                case 9:
                    c1.displayContactsSortedByState(a);
                    break;
                case 10:
                    c1.displayContactsSortedByZip(a);
                    break;
            }
        } while (z != 0);

    }
}
