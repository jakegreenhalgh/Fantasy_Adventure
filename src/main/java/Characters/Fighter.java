package Characters;

import Enemies.Enemy;
import Items.WeaponType;
import Items.ArmourType;
import Items.IWeapon;


public abstract class Fighter extends Player implements IWeapon {
    private WeaponType weaponType;
    private ArmourType armourType;

    public Fighter(String name, int health, WeaponType weaponType, ArmourType armourType) {
        super(name, health);
        this.weaponType = weaponType;
        this.armourType = armourType;
    }

    @Override
    public String attack(Enemy enemy) {
        int attackDamage = this.weaponType.getDamage();
        enemy.takeDamage(attackDamage);
        return "Enemy has taken " + attackDamage + " damage, and now has " + enemy.getHealth() + " health";
    }
}
