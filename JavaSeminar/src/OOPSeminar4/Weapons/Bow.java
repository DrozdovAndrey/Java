package OOPSeminar4.Weapons;

public class Bow implements Weapon {



    @Override
    public int damage() {
        return 20;
    }
    @Override
    public String toString() {
        return String.format("Bow %d", damage());
    }


}
