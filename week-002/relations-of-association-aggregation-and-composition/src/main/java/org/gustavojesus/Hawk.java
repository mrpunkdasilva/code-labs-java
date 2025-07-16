package org.gustavojesus;

class Hawk extends Animal implements MovementBehavior {
    public Hawk() {
        super("Hawk");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public void train() {
        System.out.println(name + " is being trained.");
    }

    @Override
    public String getBehaviors() {
        return "can fly, can walk";
    }

    @Override
    public String move() {
        return "flies, walks";
    }
}