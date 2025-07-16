package org.gustavojesus;

public class Main {
    public static void main(String[] args) {
        // Creating pets
        Animal m1 = new Cat();
        Animal m2 = new Duck();
        Animal m3 = new Lizard();
        Animal m4 = new Bat();
        Animal m5 = new Hawk();

        // Creating player
        Player player = new Player();
        player.acquirePet(m1);
        player.acquirePet(m2);

        // Displaying behaviors of each pet
        System.out.println("Behavior of " + m1 + ": " + m1.getBehaviors());
        System.out.println("Behavior of " + m2 + ": " + m2.getBehaviors());
        System.out.println("Behavior of " + m3 + ": " + m3.getBehaviors());
        System.out.println("Behavior of " + m4 + ": " + m4.getBehaviors());
        System.out.println("Behavior of " + m5 + ": " + m5.getBehaviors());

        // Showing all pets owned by the player
        player.showPets();
    }
}