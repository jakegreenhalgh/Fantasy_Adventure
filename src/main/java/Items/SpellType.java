package Items;

public enum SpellType {

    FIREBALL(35),
    LIGHTNING_STRIKE(25),
    ELDRITCH_BLAST(30),
    CURSE_OF_YEARS(20);

    private final int damage;

    SpellType(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
