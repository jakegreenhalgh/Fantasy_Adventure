package Items;

public enum Healing {

    WEAK_POTION(10),
    MINOR_POTION(15),
    STRONG_POTION(25),
    HERBS(5);

    final private int healPoints;

    Healing(int healPoints) {
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }
}
