package OOPSeminar4.Defends;

import OOPSeminar4.Defends.Defend;

public class Mantle implements Defend {
    private int defend = 5;

    @Override
    public int protect(int damage) {
        damage -= damage * defend / 100;
        return damage;

    }
    @Override
    public String toString() {
        return String.format("Mantle: %d", defend);
    }
}
