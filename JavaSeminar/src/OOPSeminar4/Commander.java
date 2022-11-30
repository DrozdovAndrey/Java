package OOPSeminar4;

public class Commander extends Warrior{
    public Commander(String name, Weapon weapon, int healthPoint) {
        super(name, weapon, healthPoint);
    }

    @Override
    public String toString() {
        return String.format("Commander %s",super.toString());
    }
}
