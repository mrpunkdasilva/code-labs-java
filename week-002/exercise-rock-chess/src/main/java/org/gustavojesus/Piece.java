package org.gustavojesus;

public abstract class Piece {
    protected String color;
    protected int positionX;
    protected int positionY;
    protected char image;

    public Piece(String color, int positionX, int positionY) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public abstract void move(int newPositionX, int newPositionY) throws Exception;

    public String toString() {
        return  image + " Position: " + positionX + " | " + positionY;
    }
}
