package org.gustavojesus;

public class Titular implements ITeach {
    private Subject subject;

    public Titular(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void teach() {
        System.out.println("Teaching " + subject);
    }
}

