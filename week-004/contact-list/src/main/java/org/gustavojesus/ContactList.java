package org.gustavojesus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ContactList {
    private final List<Person> persons = new ArrayList<>();

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void showPersons() {
        if (persons.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            persons.forEach(System.out::println);
        }
    }

    public List<Person> findPerson(String query) {
        return persons.stream()
                .filter(p -> p.getFirstName().equalsIgnoreCase(query) ||
                             p.getLastName().equalsIgnoreCase(query) ||
                             p.getPhoneNumber().contains(query))
                .collect(Collectors.toList());
    }

    public void sortPersons() {
        persons.sort(Comparator.comparing(Person::getFirstName)
                .thenComparing(Person::getLastName));
        System.out.println("Contacts sorted successfully.");
    }
}
