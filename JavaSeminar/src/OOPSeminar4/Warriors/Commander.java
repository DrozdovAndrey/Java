package OOPSeminar4.Warriors;

import OOPSeminar4.Defends.BulletproofVest;
import OOPSeminar4.Weapons.Weapon;

public class Commander extends Warrior {
    public Commander(String name, Weapon weapon, int healthPoint, BulletproofVest bulletproofVest) {
        super(name, weapon, healthPoint, bulletproofVest);

    }

    @Override
    public String toString() {
        return String.format("Commander %s",super.toString());
    }
}
