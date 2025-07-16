package org.gustavojesus;

enum Subject {
    MATHEMATICS("Mathematics"), SCIENCE("Science"), MUSIC("Music"), GYMNASTICS("Gymnastics");

    private final String name;

    Subject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}