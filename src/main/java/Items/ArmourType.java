package Items;

public enum ArmourType {
    STEEL(10),
    CHAIN_MAIL(7),
    LEATHER(5),
    ROBES(0);

    private final int armourRating;

    ArmourType(int armourRating) {
        this.armourRating = armourRating;
    }

    public double getArmourRating() {
        return armourRating;
    }
}
