package OOPSeminar4.Warriors;

import OOPSeminar4.Bag;
import OOPSeminar4.Defends.Defend;
import OOPSeminar4.Weapons.Weapon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Warrior<T extends Weapon, E extends Defend> {
    private String name;
    private T weapon;
    private int healthPoint;
    private E defend;
//    private List<Weapon> bagWeapons = new ArrayList<>();
//    private Iterator<Weapon> it = bagWeapons.iterator();
    private Bag bag = new Bag();

    public Warrior(String name, T weapon, int healthPoint, E defend) {
        this(name, weapon, healthPoint);
        this.defend = defend;
//        bag.setDefend(this.defend);
    }
    public Warrior(String name, T weapon, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
//        bag.setWeapon(this.weapon);

    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public E getShield() {
        return defend;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void showItemInBag() {
        bag.showItemInBag();
    }

    public void putNewItemToBag(T weapon) {
        bag.putToBag(weapon);
    }
    public void putNewItemToBag(E defend) {
        bag.putToBag(defend);
    }

    public void takeWeaponFromBag(T weapon){
        this.weapon = (T) bag.takeWeaponFromBag(weapon, this.weapon);
    }

    public void takeDefendFromBag(E defend){
        this.defend = (E) bag.takeDefendFromBag(defend, this.defend);
    }


//    public void showWeaponInBag() {
//        if(bagWeapons.isEmpty()) System.out.println("Nothing in a Bag");
//        else {
//
//            for (Weapon weapon: bagWeapons) {
//                System.out.println(weapon.toString());
//            }
//        }
//    }
//
//    public void putNewWeaponToBag(T weapon) {
//        this.bagWeapons.add(weapon);
//    }
//    public T takeWeaponFromBag(T weapon){
//        if(!bagWeapons.contains(weapon)) System.out.println("Nothing like that");
//        else {
//            bagWeapons.add(this.weapon);
//            this.weapon = weapon;
//        }
//        return weapon;
//    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return String.format("name: %s weapon: %s defend: %s health: %d", name, weapon,defend, healthPoint);
    }
}

