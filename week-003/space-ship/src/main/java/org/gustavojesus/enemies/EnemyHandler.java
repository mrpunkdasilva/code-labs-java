package org.gustavojesus.enemies;

import java.util.ArrayList;
import java.util.List;

public class EnemyHandler {
    private List<Enemy> enemies;

    public EnemyHandler() {
        enemies = new ArrayList<>();
    }

    public void addEnemy(Enemy newEnemy) {
        enemies.add(newEnemy);
    }

    public void getStatus() {
        for (Enemy enemy : enemies) {
            System.out.println(enemy.toString());
        }
    }

    public void removeEnemy(Enemy enemy) {
        enemies.remove(enemy);
    }

    public void destroyAllEnemies() {
        for (Enemy enemy : enemies) {
            enemy.destroy();
        }
        enemies.clear();
    }
}
