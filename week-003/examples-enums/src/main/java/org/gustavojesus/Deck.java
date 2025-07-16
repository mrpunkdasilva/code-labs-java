package org.gustavojesus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Deck {
    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (int value = 1; value <= 13; value++) {
                cards.add(new Card(suit, value));
            }
        }
        Collections.shuffle(cards, new Random(1));
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("O baralho está vazio!");
        }
        return cards.remove(0);
    }
}