package Characters;

import Creatures.IDefend;
import Enemies.Enemy;
import Items.ISpell;
import Items.SpellType;
import Items.ArmourType;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SpellCaster extends Player implements ISpell {

    protected SpellType spellType;
    protected ArrayList<IDefend> creatures;
    protected IDefend currentCreature;
    protected ArmourType armourType;

    public SpellCaster(String name, int health, SpellType spellType, ArrayList<IDefend> creatures, IDefend currentCreature) {
        super(name, health);
        this.spellType = spellType;
        this.creatures = creatures;
        this.currentCreature = currentCreature;
        this.armourType = ArmourType.ROBES;
    }

    @Override
    public String cast(Enemy enemy) {
        int attackDamage = this.spellType.getDamage();
        enemy.takeDamage(attackDamage);
        return "Enemy has taken " + attackDamage + " damage, and now has " + enemy.getHealth() + " health";
    }

    public void addCreature(IDefend creature) {
        this.creatures.add(creature);
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public ArrayList<IDefend> getCreatures() {
        return creatures;
    }

    public IDefend getCurrentCreature() {
        return currentCreature;
    }
}
