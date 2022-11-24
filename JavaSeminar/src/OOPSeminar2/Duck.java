package OOPSeminar2;

public class Duck extends Animal implements Flyable, Runable, Speakable, Swimable{
    public Duck(String name, String breed, String color, int countLegs, int age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public void makeSound(){
        System.out.println("Krya");
    }



    @Override
    public void fly() {
        System.out.println("90 km/h");
    }

    @Override
    public void runable() {
        System.out.println("8 km");
    }

    @Override
    public void swim() {
        System.out.println("2 km/h");
    }
}
