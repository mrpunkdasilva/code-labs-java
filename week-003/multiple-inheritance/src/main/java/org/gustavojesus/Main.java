package org.gustavojesus;

public class Main {
    public static void main(String[] args) {
        // Testing titular teacher
        Titular titular = new Titular(Subject.SCIENCE);
        titular.teach();

        // Testing substitute teacher
        Substitute substitute = new Substitute();
        substitute.assign(Subject.SCIENCE);
        substitute.assign(Subject.GYMNASTICS);
        substitute.assign(Subject.MUSIC);

        substitute.teach(); // Teaching science
        substitute.teach(); // Teaching gymnastics
        substitute.teach(); // Teaching music
    }
}
