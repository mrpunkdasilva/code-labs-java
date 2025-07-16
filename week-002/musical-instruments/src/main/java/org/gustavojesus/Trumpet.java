package org.gustavojesus;

class Trumpet extends Instrument {
    private String note;

    public Trumpet(String note) {
        this.note = note;
    }

    @Override
    public void play() {
        System.out.println("Trumpet: plays " + note);
    }

    @Override
    public String toString() {
        return "Trumpet";
    }
}
