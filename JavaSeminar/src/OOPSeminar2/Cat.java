package OOPSeminar2;

public class Cat extends Animal implements Speakable, Runable{

    public Cat(String name, String breed, String color, int countLegs, int age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public void makeSound() {
        System.out.println("May-may");
    }
    @Override
    public void runable() {
        System.out.println("30 km/h");
    }

}
