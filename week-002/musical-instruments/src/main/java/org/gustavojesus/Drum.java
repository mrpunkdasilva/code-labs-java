package org.gustavojesus;

class Drum extends Instrument {
    @Override
    public void play() {
        System.out.println("Drum: beats");
    }

    @Override
    public String toString() {
        return "Drum";
    }
}