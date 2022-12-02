package OOPSeminar4.Defends;

public class BulletproofVest implements Defend {
    private int defend = 50;

    @Override
    public int protect(int damage) {
        damage -= damage * defend / 100;
        return damage;

    }
    @Override
    public String toString() {
        return String.format("BulletproofVest: %d", defend);
    }
}
