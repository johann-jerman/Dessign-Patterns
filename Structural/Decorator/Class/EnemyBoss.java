package Structural.Decorator.Class;

import Structural.Decorator.Decorator.EnemyDecorator;
import Structural.Decorator.Interfaces.IEnemy;

public class EnemyBoss extends EnemyDecorator {
    public EnemyBoss(IEnemy enemy) {
        super(enemy);
    }
    @Override
    public void atack() {
        getEnemy().atack();
    }

    @Override
    public void getDamage() {
        getEnemy().getDamage();
    }

    @Override
    public void walk() {
        getEnemy().walk();
    }

    @Override
    public void run() {
        getEnemy().run();
    }
}
