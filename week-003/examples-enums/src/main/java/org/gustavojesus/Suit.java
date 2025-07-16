package org.gustavojesus;

public enum Suit {
        PAUS("P"), OURO("O"), COPAS("C"), ESPADAS("E");

    private final String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
