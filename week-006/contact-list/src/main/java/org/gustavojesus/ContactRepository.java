package org.gustavojesus;

/**
 * This interface defines the contract for a contact repository.
 * It provides methods for adding, searching, and removing contacts.
 */
interface ContactRepository {

    /**
     * Adds a new contact to the repository.
     *
     * @param name  The name of the contact. Cannot be null or empty.
     * @param phone The phone number of the contact. Cannot be null or empty.
     */
    void addContact(String name, String phone);

    /**
     * Searches for a contact by name in the repository.
     *
     * @param name The name of the contact to search for. Cannot be null or empty.
     */
    void searchContact(String name);

    /**
     * Removes a contact from the repository by name.
     *
     * @param name The name of the contact to remove. Cannot be null or empty.
     */
    void removeContact(String name);
}