package org.gustavojesus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlphabetSoup game = new AlphabetSoup();

        System.out.println("Welcome to Alphabet Soup!");
        game.printAlphabetSoup();

        while (true) {
            System.out.print("Enter a word to search (or type 'exit' to quit): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if ("exit".equals(input)) {
                System.out.println("Thanks for playing!");
                break;
            }

            game.findWord(input);
        }

        scanner.close();
    }
}
