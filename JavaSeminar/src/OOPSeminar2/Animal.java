package OOPSeminar2;

public abstract class Animal {
    protected String name;
    protected String breed;
    protected String color;
    protected int countLegs;
    protected int age;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getCountLegs() {
        return countLegs;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, String breed, String color, int countLegs, int age) {
        this(name, breed, color, age);
        this.countLegs = countLegs;

    }

    public Animal(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("name: %s", getName());
    }
}
