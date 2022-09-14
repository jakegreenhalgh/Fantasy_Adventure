package Characters;

import Creatures.IDefend;
import Items.SpellType;

public class Wizard extends SpellCaster {

    public Wizard(String name, int health, SpellType spellType, IDefend currentCreature) {
        super(name, health, spellType, currentCreature);
    }
}
