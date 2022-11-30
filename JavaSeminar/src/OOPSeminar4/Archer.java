package OOPSeminar4;

public class Archer extends Warrior<Bow>{
    private int range;

    public Archer(String name, Bow weapon, int healthPoint, int range) {
        super(name, weapon, healthPoint);
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
