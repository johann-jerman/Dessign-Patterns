package Structural.Decorator.Decorator;

import Structural.Decorator.Interfaces.IEnemy;

public abstract class EnemyDecorator  implements IEnemy {
    private IEnemy enemy;

    public EnemyDecorator(IEnemy enemy) {
        this.enemy = enemy;
    }

    protected IEnemy getEnemy(){
        return this.enemy;
    }
}
