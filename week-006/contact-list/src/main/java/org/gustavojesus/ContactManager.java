package org.gustavojesus;

import java.util.Map;

/**
 * Manages contacts using a {@link FileHandler} to load, save, and manipulate contact data.
 */
class ContactManager implements ContactRepository {
    private Map<String, Contact> contacts;
    private FileHandler fileHandler;

    /**
     * Constructs a new {@code ContactManager} instance.
     *
     * @param fileHandler the {@link FileHandler} used to load and save contact data
     */
    public ContactManager(FileHandler fileHandler) {
        this.fileHandler = fileHandler;
        this.contacts = fileHandler.loadContacts();
    }

    /**
     * Adds a new contact to the manager.
     *
     * @param name  the name of the contact
     * @param phone the phone number of the contact
     */
    @Override
    public void addContact(String name, String phone) {
        contacts.put(name, new Contact(name, phone));
        fileHandler.saveContacts(contacts);
        System.out.println("Contact added successfully!");
    }

    /**
     * Searches for a contact by name.
     *
     * @param name the name of the contact to search for
     */
    @Override
    public void searchContact(String name) {
        Contact contact = contacts.get(name);
        if (contact != null) {
            System.out.println("Contact found: " + contact.getName() + " - " + contact.getPhone());
        } else {
            System.out.println("Contact not found.");
        }
    }

    /**
     * Removes a contact from the manager.
     *
     * @param name the name of the contact to remove
     */
    @Override
    public void removeContact(String name) {
        if (contacts.remove(name) != null) {
            fileHandler.saveContacts(contacts);
            System.out.println("Contact removed successfully!");
        } else {
            System.out.println("Contact not found.");
        }
    }
}