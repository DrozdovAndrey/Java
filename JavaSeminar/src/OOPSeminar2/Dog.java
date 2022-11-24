package OOPSeminar2;

public class Dog extends Animal implements Speakable, Runable{
    public Dog(String name, String breed, String color, int countLegs, int age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Wof-wof");
    }


    @Override
    public void runable() {
        System.out.println("30 km/h");
    }
}
