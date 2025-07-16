package org.gustavojesus;

import java.util.Scanner;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static final ContactList contacts = new ContactList();

    public static void main(String[] args) {
        initializeContacts();
        menu();
    }

    private static void initializeContacts() {
        List<Person> initialContacts = List.of(
                new Person("Gustavo", "Lavadenz", "77777555"),
                new Person("Ana", "Flores", "77777512"),
                new Person("Maria", "Ferreira", "58965412"),
                new Person("Peter", "Parker", "21452365"),
                new Person("Bruce", "Wayne", "87459632"),
                new Person("Ana", "Vargas", "54777512")
        );
        initialContacts.forEach(contacts::addPerson);
    }

    private static void menu() {
        while (true) {
            System.out.println("\nContact Manager");
            System.out.println("1 - Add Contact");
            System.out.println("2 - Show All Contacts");
            System.out.println("3 - Find a Contact");
            System.out.println("4 - Sort Contacts");
            System.out.println("5 - Exit");
            System.out.print("Choose an option: ");

            switch (input.nextInt()) {
                case 1 -> addPerson();
                case 2 -> contacts.showPersons();
                case 3 -> findContact();
                case 4 -> contacts.sortPersons();
                case 5 -> exitApp();
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void addPerson() {
        input.nextLine(); // Consume newline
        System.out.print("Insert a name: ");
        String name = input.nextLine();
        System.out.print("Insert last name: ");
        String lastName = input.nextLine();
        System.out.print("Insert phone number: ");
        String phone = input.nextLine();

        contacts.addPerson(new Person(name, lastName, phone));
        System.out.println("Contact added successfully!");
    }

    private static void findContact() {
        input.nextLine(); // Consume newline
        System.out.print("Insert name or phone: ");
        String data = input.nextLine();

        List<Person> filtered = contacts.findPerson(data);
        if (!filtered.isEmpty()) {
            filtered.forEach(System.out::println);
        } else {
            System.out.printf("No contact found for: %s\n", data);
        }
    }

    private static void exitApp() {
        System.out.println("Goodbye!");
        System.exit(0);
    }
}
