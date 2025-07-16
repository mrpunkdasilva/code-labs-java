package org.gustavojesus;

public record Card(Suit suit, int value) implements Comparable<Card> {

    @Override
    public String toString() {
        return suit.getSymbol() + (value == 1 ? "A" : (value == 11 ? "J" : (value == 12 ? "Q" : (value == 13 ? "K" : value))));
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.value, other.value);
    }
}