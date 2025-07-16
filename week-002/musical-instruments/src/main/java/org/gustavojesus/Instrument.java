package org.gustavojesus;

abstract class Instrument {
    // Abstract method to play the instrument
    public abstract void play();

    // Abstract method to return a string representation of the instrument
    @Override
    public abstract String toString();
}