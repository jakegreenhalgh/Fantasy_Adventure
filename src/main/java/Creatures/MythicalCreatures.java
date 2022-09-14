package Creatures;

import Enemies.Enemy;

public abstract class MythicalCreatures implements IDefend {

    protected int health;
    protected int attack;

    public MythicalCreatures(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    @Override
    public String defend(Enemy enemy) {
        int attackDamage = this.attack;
        enemy.takeDamage(attackDamage);
        return "Enemy has taken " + attackDamage + " damage, and now has " + enemy.getHealth() + " health";
    }

}
