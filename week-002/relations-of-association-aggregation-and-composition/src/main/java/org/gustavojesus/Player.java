package org.gustavojesus;

import java.util.ArrayList;
import java.util.List;

class Player {
    private List<Animal> pets;

    public Player() {
        pets = new ArrayList<>();
    }

    // Method to acquire a pet
    public void acquirePet(Animal pet) {
        pets.add(pet);
        System.out.println("Player acquired a pet: " + pet);
    }

    // Method to display all pets
    public void showPets() {
        System.out.println("Player has the following pets:");
        for (Animal pet : pets) {
            System.out.println(pet + ": " + pet.getBehaviors());
        }
    }
}
