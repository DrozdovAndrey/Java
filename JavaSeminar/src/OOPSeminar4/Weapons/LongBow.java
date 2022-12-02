package OOPSeminar4.Weapons;

import OOPSeminar4.Weapons.Bow;

public class LongBow extends Bow {
    @Override
    public int damage() {
        return 40;
    }
    @Override
    public String toString() {
        return String.format("LongBow: %d", damage());
    }
}
