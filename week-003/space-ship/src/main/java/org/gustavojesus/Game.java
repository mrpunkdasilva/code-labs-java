package org.gustavojesus;

import org.gustavojesus.enemies.Enemy;
import org.gustavojesus.enemies.EnemyHandler;
import org.gustavojesus.spaceships.Spaceship;

public class Game {
       private Spaceship player;
       private EnemyHandler enemyHandler;

        public Game() {
            player = new Spaceship("mark 1", "blue");
        }

        public void shoot() {
            player.shoot();
        }

        public void moveDown() {
            player.moveDown();
        }

        public void moveUp() {
            player.moveUp();
        }

        public void addEnemy(Enemy enemy) {
            enemyHandler.addEnemy(enemy);
        }

        public void removeEnemy(Enemy enemy) {
            enemyHandler.removeEnemy(enemy);
        }

        public void getStatus() {
            System.out.println(player.toString());
            System.out.println(enemyHandler);
        }

        public void gameOver() {
            System.out.println("Game Over!");
            enemyHandler.destroyAllEnemies();
            player.destroy();
        }
}
