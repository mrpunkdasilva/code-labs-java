package org.gustavojesus;


abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Abstract methods for behaviors
    public abstract void eat();
    public abstract void sleep();
    public abstract void train();

    // Method to get the behaviors of the animal
    public abstract String getBehaviors();

    @Override
    public String toString() {
        return name;
    }
}
