package OOPSeminar4.Warriors;

import OOPSeminar4.Defends.Shield;
import OOPSeminar4.Weapons.Bow;

public class Archer extends Warrior<Bow, Shield> {
    private int range;

    public Archer(String name, Bow weapon, int healthPoint, Shield shield, int range) {
        super(name, weapon, healthPoint, shield);
        this.range = range;
    }

    @Override
    public String toString() {
        return String.format("Archer %s, defeatDist %d",super.toString(), range);
    }

    public int getRange() {
        return range;
    }
}
