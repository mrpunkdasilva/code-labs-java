package org.gustavojesus;

class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Guitar: strums");
    }

    @Override
    public String toString() {
        return "Guitar";
    }
}
