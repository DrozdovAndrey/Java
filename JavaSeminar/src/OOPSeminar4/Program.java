package OOPSeminar4;

import OOPSeminar4.Defends.BulletproofVest;
import OOPSeminar4.Defends.Mantle;
import OOPSeminar4.Defends.Shield;
import OOPSeminar4.Defends.SmallWoodenShield;
import OOPSeminar4.Warriors.*;
import OOPSeminar4.Weapons.Bow;
import OOPSeminar4.Weapons.LongBow;
import OOPSeminar4.Weapons.Staff;

public class Program {
    public static void main(String[] args) {
        Commander commander1 = new Commander("Jonh", new Staff(), 150, new BulletproofVest());
        Commander commander2 = new Commander("Billy", new Bow(), 150, new BulletproofVest());
        Team<Archer> teamArcher = new Team<>(commander1);
        teamArcher.add(new Archer("Bobbie", new Bow(), 100,new Shield(), 50));
        teamArcher.add(new Archer("Lamie", new LongBow(), 100,new Shield(), 50));
        teamArcher.add(new Archer("Ralf", new Bow(), 100,new Shield(), 50));
        Team<Warrior> teamWarrior = new Team<>(commander2);
        teamWarrior.add(new Archer("Bany", new Bow(), 100,new Shield(), 50));
        teamWarrior.add(new Mage("Moguchiy", new Staff(), 100, new Mantle(),80, 45));
        System.out.println(teamWarrior);
        System.out.println(teamArcher);
        System.out.println(teamArcher.getTeamHP());
        System.out.println(teamWarrior.getTeamHP());
        //Examples, how to work bag
        System.out.println("-------------");
        Archer archer1 = new Archer("Arseniy", new Bow(), 100,new Shield(), 50);
        System.out.println(archer1);

        Bow bow = new LongBow();
        Shield shield = new SmallWoodenShield();
        archer1.putNewItemToBag(bow);
        archer1.putNewItemToBag(shield);
        archer1.showItemInBag();

        archer1.takeWeaponFromBag(bow);
        archer1.takeDefendFromBag(shield);
        System.out.println(archer1);

        archer1.showItemInBag();

    }
}
