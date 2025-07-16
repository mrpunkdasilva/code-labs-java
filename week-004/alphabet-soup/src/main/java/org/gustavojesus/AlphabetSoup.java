package org.gustavojesus;

public class AlphabetSoup {
    private static final int SIZE = 5;
    private final char[][] letters;

    public AlphabetSoup() {
        this.letters = new char[][]{
                {'x', 'h', 'b', 'c', 'd'},
                {'r', 'e', 'k', 'l', 'o'},
                {'a', 'l', 'b', 'm', 'q'},
                {'o', 'l', 'l', 'e', 'h'},
                {'x', 'o', 'b', 'c', 'd'}
        };
    }

    public void printAlphabetSoup() {
        for (char[] row : letters) {
            System.out.println(String.join(" | ", new String(row)));
        }
    }

    public void findWord(String word) {
        if (findHorizontally(word)) {
            System.out.println("The word is found horizontally.");
        } else if (findVertically(word)) {
            System.out.println("The word is found vertically.");
        } else {
            System.out.println("The word is not found.");
        }
    }

    private boolean findHorizontally(String word) {
        for (char[] row : letters) {
            String rowStr = new String(row);
            if (containsWord(rowStr, word)) {
                return true;
            }
        }
        return false;
    }

    private boolean findVertically(String word) {
        for (int col = 0; col < SIZE; col++) {
            StringBuilder columnStr = new StringBuilder();
            for (char[] row : letters) {
                columnStr.append(row[col]);
            }
            if (containsWord(columnStr.toString(), word)) {
                return true;
            }
        }
        return false;
    }

    private boolean containsWord(String line, String word) {
        return line.contains(word) || new StringBuilder(line).reverse().toString().contains(word);
    }
}
