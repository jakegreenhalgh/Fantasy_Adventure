package Items;

//import Enemies.Enemy;

public enum WeaponType {
    AXE(50),
    SWORD(40);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
