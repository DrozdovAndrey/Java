package OOPSeminar4.Defends;

public class SmallWoodenShield extends Shield{
    private int defend = 15;

    @Override
    public int protect(int damage) {
        damage -= damage * defend / 100;
        return damage;

    }
    @Override
    public String toString() {
        return String.format("Small wooden shield: %d", defend);
    }
}
