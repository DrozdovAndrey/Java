package OOPSeminar2;

public class Fish extends Animal implements Swimable{
    public Fish(String name, String breed, String color, int age) {
        super(name, breed, color, age);
    }


    @Override
    public void swim() {
        System.out.println("5 km/h");
    }
}
