package org.gustavojesus;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class FileHandler {
    private static final String CONTACTS_FILE = "src/main/resources/contacts.txt";

    /**
     * Loads contacts from the specified file into a HashMap.
     *
     * @return A HashMap containing the loaded contacts, with the contact's name as the key and the contact object as the value.
     * If the contacts file is not found, a new file will be created and an empty HashMap will be returned.
     */
    public Map<String, Contact> loadContacts() {
        Map<String, Contact> contacts = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(CONTACTS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    contacts.put(data[0], new Contact(data[0], data[1]));
                }
            }
        } catch (IOException e) {
            System.out.println("Contacts file not found. A new file will be created.");
        }
        return contacts;
    }

    /**
     * Saves the given contacts to the specified file.
     *
     * @param contacts A HashMap containing the contacts to be saved, with the contact's name as the key and the contact object as the value.
     */
    public void saveContacts(Map<String, Contact> contacts) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CONTACTS_FILE))) {
            for (Contact contact : contacts.values()) {
                bw.write(contact.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }
}