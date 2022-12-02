package OOPSeminar4;

import OOPSeminar4.Defends.Defend;
import OOPSeminar4.Weapons.Weapon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag {

    private List<Weapon> weaponList = new ArrayList<>();
    private List<Defend> defendList = new ArrayList<>();
    private Iterator<Weapon> weaponIterator = weaponList.iterator();
    private Iterator<Defend> defendIterator = defendList.iterator();

    public void putToBag(Weapon weapon){
        weaponList.add(weapon);
    }
    public void putToBag(Defend defend){
        defendList.add(defend);
    }
    public void showItemInBag() {
        System.out.println("-------------");
        showWeapon();
        showDefend();
        System.out.println("-------------");
    }
    public void showWeapon(){
        if (weaponList.isEmpty()) System.out.println("No weapon in a bag");
        else {
            System.out.println("Your weapon in a bag:");
            for (Weapon weapon : weaponList) {
                System.out.println(weapon.toString());
            }
        }
    }
    public  void showDefend(){
        if (defendList.isEmpty()) System.out.println("No defend in a bag");
        else {
            System.out.println("Your defend in a bag:");
            for (Defend defend : defendList) {
                System.out.println(defend.toString());
            }
        }
    }
    public Weapon takeWeaponFromBag(Weapon weapon, Weapon inHand){
        if(!weaponList.contains(weapon)) System.out.println("Nothing like that");
        else {
            weaponList.add(inHand);
            weaponList.remove(weapon);
            inHand = weapon;
        }
        return inHand;
    }
    public Defend takeDefendFromBag(Defend defend, Defend inHand){
        if(!defendList.contains(defend)) System.out.println("Nothing like that");
        else {
            defendList.add(inHand);
            defendList.remove(inHand);
            inHand = defend;
        }
        return inHand;
    }

}
