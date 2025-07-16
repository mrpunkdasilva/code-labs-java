package org.gustavojesus;

import org.gustavojesus.enemies.Boss;
import org.gustavojesus.enemies.Ship;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Ship ship = new Ship();
        Boss boss = new Boss();

        game.addEnemy(ship);
        game.addEnemy(boss);

        game.moveDown();

        game.shoot();
        game.removeEnemy(ship);
        game.moveUp();

        boss.shoot();

        game.gameOver();

        game.getStatus();
    }
}