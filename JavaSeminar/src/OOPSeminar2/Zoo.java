package OOPSeminar2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    public Zoo(){
        animals = new ArrayList<>(Arrays.asList(new Dog("Choi",
                "Biver", "Black, White, Orange", 4,
                1), new Cat("Sensei", "Krasivi",
                "Grey", 4,9), new Fish("Tune",
                "Shark", "White",  1), new Duck("Skrudge",
                "duck", "white, black", 2, 2),
                new SeeCow("SeeCow", "Sirena", "Grey", 50)));

    }
    public void talk(){
        for (Speakable animal: getSpeakable()){
            System.out.println(animal.toString());
            animal.makeSound();
        }
    }
    public  List<Speakable> getSpeakable(){
        List<Speakable> result = new ArrayList<>();
        for (Animal animal: animals){
            if(animal instanceof Speakable){
                result.add((Speakable) animal);
            }
        }
        return result;
    }

    public  List<Runable> getRunable(){
        List<Runable> result = new ArrayList<>();
        for (Animal animal: animals){
            if(animal instanceof Runable){
                result.add((Runable) animal);
            }
        }
        return result;
    }
    public  List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal animal: animals){
            if(animal instanceof Flyable){
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    public void run(){
        for (Runable animal: getRunable()){
            System.out.println(animal.toString());
            animal.runable();
        }
    }

    public void fly(){
        for (Flyable animal: getFlyable()){
            System.out.println(animal.toString());
            animal.fly();
        }
    }
    public  List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal animal: animals){
            if(animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }
        return result;
    }

    public void swim(){
        for (Swimable animal: getSwimable()){
            System.out.println(animal.toString());
            animal.swim();
        }
    }


}
