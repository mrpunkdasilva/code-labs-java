package org.gustavojesus;

public class Main {
    public static void main(String[] args) {
        // Creating instruments
        Instrument guitar = new Guitar();
        Instrument drum = new Drum();
        Instrument trumpet = new Trumpet("C");

        // Creating orchestra
        Orchestra orchestra = new Orchestra();
        orchestra.add(guitar);
        orchestra.add(drum);
        orchestra.add(trumpet);

        // Playing all instruments
        orchestra.play();

        // Playing a specific instrument
        orchestra.play(0); // Play the guitar
    }
}