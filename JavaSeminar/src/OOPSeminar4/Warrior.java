package OOPSeminar4;

public abstract class Warrior<T extends Weapon> {
    private String name;
    private T weapon;
    private int healthPoint;

    public Warrior(String name, T weapon, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return String.format("name: %s weapon: %s health: %d", name, weapon, healthPoint);
    }
}

