package org.gustavojesus;

class Duck extends Animal implements MovementBehavior {
    public Duck() {
        super("Duck");
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
        return "can walk, can fly, can swim";
    }

    @Override
    public String move() {
        return "walks, flies, swims";
    }
}