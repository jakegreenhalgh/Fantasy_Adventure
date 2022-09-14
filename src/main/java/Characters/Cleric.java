package Characters;

import Items.ArmourType;
import Items.Healing;

public class Cleric extends Player {

    Healing healing;
    ArmourType armourType;

    public Cleric(String name, int health, Healing healing) {
        super(name, health);
        this.healing = healing;
        this.armourType = ArmourType.ROBES;
    }


    public void heal(Player player) {
        player.heal(this.healing.getHealPoints());
    }
}
