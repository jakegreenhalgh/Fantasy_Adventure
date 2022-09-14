package Characters;

import Items.ArmourType;

public abstract class Player {
    protected String name;
    protected int health;
    protected ArmourType armourType;



    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.armourType = armourType.ROBES;
    }

    public void takeDamage(int attack) {
        health -= attack;
    }

    public void heal(int points) {
        this.health += points;
    }

    public int getHealth() {
        return health;
    }
}
