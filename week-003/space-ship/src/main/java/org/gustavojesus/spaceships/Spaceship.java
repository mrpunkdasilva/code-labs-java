package org.gustavojesus.spaceships;

import org.gustavojesus.interfaces.IDestroyable;
import org.gustavojesus.interfaces.IShootable;

public class Spaceship implements IShootable, IDestroyable {
    private String name;
    private String color;
    private int life;
    private int points;
    private int positionX;
    private int positionY;

    public Spaceship(String name, String color) {
        this.name = name;
        this.color = color;
        this.points = 0;
        this.life = 3;
    }

    public void moveUp () {
        positionY++;
    }

    public void moveDown() {
        positionY--;
    }

    public void moveLeft() {
        positionX--;
    }

    public void moveRight() {
        positionX++;
    }

    public String toString() {
        return "Spaceship: " + name + ", color: " + color + ", life: " + life + ", points: " + points + ", position: (" + positionX + ", " + positionY + ")";
    }

    @Override
    public void shoot() {
        System.out.println("Spaceship shoots!");
    }

    @Override
    public void destroy() {

    }
}
