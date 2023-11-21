package Structural.Decorator.Class;

import Structural.Decorator.Interfaces.IEnemy;

public class Enemy implements IEnemy {
    @Override
    public void atack() {
        System.out.println("atack");
    }

    @Override
    public void getDamage() {
        System.out.println("get 6 damage");
    }

    @Override
    public void walk() {
        System.out.println("walking");
    }

    @Override
    public void run() {
        System.out.println("running");
    }
}
