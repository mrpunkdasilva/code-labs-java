package org.gustavojesus;

class Lizard extends Animal implements MovementBehavior {
    public Lizard() {
        super("Lizard");
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
        return "can walk";
    }

    @Override
    public String move() {
        return "walks";
    }
}