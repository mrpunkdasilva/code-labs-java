package org.gustavojesus;

public class Rock extends Piece {
    public Rock(String color, int positionX, int positionY) {
        super(color, positionX, positionY);
        this.image = '♜';
    }

    @Override
    public void move(int newPositionX, int newPositionY) {
        if (newPositionX != newPositionY) {
            positionX = newPositionX;
            positionY = newPositionY;
        } else {
            throw new IllegalArgumentException("Rock can only move horizontally or vertically.");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
