package org.gustavojesus.enemies;

import org.gustavojesus.interfaces.IDestroyable;
import org.gustavojesus.interfaces.IShootable;

public class Enemy implements IShootable, IDestroyable {
    private String name;
    private int life;
    private boolean isAlive;

    public Enemy(int life, String name) {
        this.life = life;
        this.name = name;
        this.isAlive = true;
    }

    @Override
    public void shoot() {
        System.out.println();
    }

    public String toString() {
        return "Name: " + name + ", Life: " + life;
    }

    @Override
    public void destroy() {
        isAlive = false;
        System.out.println("Enemy destroyed!");
    }
}
