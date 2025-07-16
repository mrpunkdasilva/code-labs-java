package org.gustavojesus;

class Cat extends Animal implements MovementBehavior {
    public Cat() {
        super("Cat");
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