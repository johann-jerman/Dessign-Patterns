package Structural.Decorator;

import Structural.Decorator.Class.Enemy;
import Structural.Decorator.Class.EnemyBoss;
import Structural.Decorator.Interfaces.IEnemy;

public class Main {
    public static void main(String[] args) {
        IEnemy enemy = new EnemyBoss(new Enemy());
        enemy.run();
    }
}
