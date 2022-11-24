package OOPSeminar2;

public class SeeCow extends Animal implements Speakable, Swimable{

    public SeeCow(String name, String breed, String color, int age) {
        super(name, breed, color, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Frrrr");
    }

    @Override
    public void swim() {
        System.out.println("1 km/h");
    }
}
