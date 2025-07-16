package org.gustavojesus;

import java.util.Objects;

public class Board {
    private final int size;
    private char[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new char[this.size][this.size];
    }

    public int getSize() {
        return size;
    }

    public char[][] getCells() {
        return board;
    }

    public void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void addPiece(Piece piece) throws Exception {
        if (piece.positionX >= size | piece.positionY >= size) {
            throw new Exception("Invalid position. The board size is " + size + "x" + size);
        }

        if (board[piece.positionX][piece.positionY] == ' ') {
            board[piece.positionX][piece.positionY] = piece.image;
        } else {
            throw new Exception("The chosen position is already occupied.");
        }
    }

    public void drawBoard() {
        System.out.println("\n+---" + "-".repeat(size * 4) + "+");

        for (int i = 0; i < size; i++) {
            System.out.print("| ");
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n+---" + "-".repeat(size * 4) + "+");
        }

        System.out.println();
    }
}
