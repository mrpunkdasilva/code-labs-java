package org.gustavojesus;

import java.util.ArrayList;
import java.util.List;

class Orchestra {
    private List<Instrument> instruments;

    public Orchestra() {
        instruments = new ArrayList<>();
    }

    // Method to add an instrument to the orchestra
    public void add(Instrument instrument) {
        instruments.add(instrument);
    }

    // Method to play all instruments
    public void play() {
        System.out.println("Orchestra:");
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    // Method to play a specific instrument by index
    public void play(int index) {
        if (index >= 0 && index < instruments.size()) {
            System.out.println(instruments.get(index).toString() + ":");
            instruments.get(index).play();
        } else {
            System.out.println("Invalid instrument index.");
        }
    }
}