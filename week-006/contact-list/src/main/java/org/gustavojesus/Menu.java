package org.gustavojesus;

import java.util.Scanner;


/**
 * This class represents the main menu of the contact list application.
 * It provides options to add, search, remove, and exit the program.
 */
class Menu {
    private ContactRepository contactRepository;
    private Scanner scanner;

    /**
     * Constructs a new Menu object with the given ContactRepository.
     *
     * @param contactRepository the repository to store and retrieve contact information
     */
    public Menu(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Displays the menu options and handles user input to perform the corresponding actions.
     * The menu will continue to display until the user chooses to exit.
     */
    public void displayMenu() {
        while (true) {
            AsciiArt.printMenuArt();
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Remove Contact");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (option) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter contact phone: ");
                    String phone = scanner.nextLine();
                    contactRepository.addContact(name, phone);
                    break;
                case 2:
                    System.out.print("Enter contact name to search: ");
                    name = scanner.nextLine();
                    contactRepository.searchContact(name);
                    break;
                case 3:
                    System.out.print("Enter contact name to remove: ");
                    name = scanner.nextLine();
                    contactRepository.removeContact(name);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}