package OOPSeminar4.Warriors;

import OOPSeminar4.Defends.Mantle;
import OOPSeminar4.Weapons.Staff;

public class Mage extends Warrior<Staff, Mantle> {
    private int mana;
    private int range;

    public Mage(String name, Staff weapon, int healthPoint, Mantle mantle, int mana, int range) {
        super(name, weapon, healthPoint, mantle);
        this.mana = mana;
        this.range = range;
    }
    @Override
    public String toString() {
        return String.format("Mage %s, range: %d, mana: %d",super.toString(), range, mana);
    }

    public int getMana() {
        return mana;
    }

    public int getRange() {
        return range;
    }
}
