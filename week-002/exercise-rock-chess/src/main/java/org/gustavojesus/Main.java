package org.gustavojesus;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(8);
        Rock rock = new Rock("red", 0, 0);
        Rock rock2 = new Rock("black", 0, 7);

        board.initializeBoard();
        board.drawBoard();

        try {
            board.addPiece(rock);
            board.addPiece(rock2);
            board.drawBoard();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            rock.move(2, 1);
            rock2.move(6, 1);

            board.initializeBoard();
            board.addPiece(rock);
            board.addPiece(rock2);

            board.drawBoard();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}