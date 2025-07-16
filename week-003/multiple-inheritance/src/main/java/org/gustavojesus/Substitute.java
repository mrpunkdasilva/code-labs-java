package org.gustavojesus;

import java.util.LinkedList;
import java.util.Queue;

class Substitute implements ITeach {
    private Queue<Subject> subjects = new LinkedList<>();

    public void assign(Subject subject) {
        subjects.add(subject);
    }

    @Override
    public void teach() {
        if (!subjects.isEmpty()) {
            Subject subject = subjects.poll();
            System.out.println("Teaching " + subject);
        } else {
            System.out.println("No subject assigned to teach.");
        }
    }
}