package OOPSeminar4;

public class Mage extends Warrior<Staff>{
    private int mana;
    private int range;

    public Mage(String name, Staff weapon, int healthPoint, int mana, int range) {
        super(name, weapon, healthPoint);
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
