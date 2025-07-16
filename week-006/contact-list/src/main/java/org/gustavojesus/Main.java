package org.gustavojesus;

/**
 * This is the entry point of the contact list application.
 * It initializes the necessary components and starts the user interface.
 *
 */
public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        ContactRepository contactRepository = new ContactManager(fileHandler);
        Menu menu = new Menu(contactRepository);
        menu.displayMenu();
    }
}