package OOPSeminar4;

public class Staff implements Weapon{
    @Override
    public int damage() {
        return 10;
    }
    @Override
    public String toString() {
        return String.format("Staff: %d", damage());
    }
}
