package org.gustavojesus;

/**
 * Represents a contact with a name and phone number.
 */
class Contact {
    private String name;
    private String phone;

    /**
     * Constructs a new Contact with the given name and phone number.
     *
     * @param name  The name of the contact.
     * @param phone The phone number of the contact.
     */
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    /**
     * Returns the name of the contact.
     *
     * @return The name of the contact.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the phone number of the contact.
     *
     * @return The phone number of the contact.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Returns a string representation of the contact in the format "name,phone".
     *
     * @return A string representation of the contact.
     */
    @Override
    public String toString() {
        return name + "," + phone;
    }
}