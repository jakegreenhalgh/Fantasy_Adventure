package Enemies;

import Characters.Fighter;
import Characters.Player;

public abstract class Enemy {
    protected String name;
    protected int health;
    protected int enemyAttack;

    public Enemy(String name, int health, int enemyAttack) {
        this.name = name;
        this.health = health;
        this.enemyAttack = enemyAttack;
    }

    public void takeDamage(int attack) {
        health -= attack;
    }

    public int getHealth() {
        return health;
    }

    public void attackPlayer(Player player) {
        player.takeDamage(enemyAttack);
    }
}
