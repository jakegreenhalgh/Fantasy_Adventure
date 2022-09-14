import Characters.Cleric;
import Characters.Knight;
import Characters.Wizard;
import Creatures.Dragon;
import Creatures.IDefend;
import Enemies.Ogre;
import Items.ArmourType;
import Items.Healing;
import Items.SpellType;
import Items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Knight knight;
    Wizard wizard;
    Cleric cleric;
    Ogre ogre;
    Dragon dragon;
    ArrayList<IDefend> creatures;

    @Before
    public void setUp() {
        ogre = new Ogre("Ogre", 50, 20);
        knight = new Knight("Arthur", 100, WeaponType.SWORD, ArmourType.STEEL);
        dragon = new Dragon(100, 45);
        wizard = new Wizard("Merlin", 70, SpellType.FIREBALL, dragon);
        cleric = new Cleric("Morgan le Fay", 70, Healing.WEAK_POTION);
    }

    @Test
    public void canAttack() {
        String result = knight.attack(ogre);
        assertEquals("Enemy has taken 40 damage, and now has 10 health", result);
    }

    @Test
    public void canCast(){
        String result = wizard.cast(ogre);
        assertEquals("Enemy has taken 35 damage, and now has 15 health", result);
    }

    @Test
    public void canDefend(){
        String result = wizard.getCurrentCreature().defend(ogre);
        assertEquals("Enemy has taken 45 damage, and now has 5 health", result);
    }

    @Test
    public void canSummonCreature(){
        wizard.addCreature(dragon);
        assertEquals(1, wizard.getCreatures().size());
    }

    @Test
    public void canHeal(){
        ogre.attackPlayer(knight);
        cleric.heal(knight);
        assertEquals(90, knight.getHealth());
    }

}
