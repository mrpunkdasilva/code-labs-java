package org.gustavojesus;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Card computerCard = deck.drawCard();
        Card playerCard = deck.drawCard();

        System.out.println("Computador: " + computerCard);
        System.out.println("Jogador: " + playerCard);

        int result = compareCards(computerCard, playerCard);
        if (result > 0) {
            System.out.println("PERDEU!");
        } else if (result < 0) {
            System.out.println("GANHOU!");
        } else {
            System.out.println("Empate");
        }
    }

    private static int compareCards(Card card1, Card card2) {
        return card1.compareTo(card2);
    }
}
