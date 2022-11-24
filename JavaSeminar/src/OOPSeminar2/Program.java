package OOPSeminar2;

public class Program {
    public static void main(String[] args) {
//        Dog dog1 = new Dog("Choi", "Biver", "Black, White, Orange", 4, 1);
//        dog1.makeSound();
//
//
//        Cat cat1 = new Cat("Sensei", "Krasivi", "Grey", 4,9);
//        cat1.makeSound();
//
//
//        Fish fish1 = new Fish("Shark",
//                "Shark", "White", 0, 1);

        Zoo zoo = new Zoo();
        System.out.println("talk");
        zoo.talk();
        System.out.println();
        System.out.println("run");
        zoo.run();
        System.out.println();
        System.out.println("fly");
        zoo.fly();
        System.out.println();
        System.out.println("swim");
        zoo.swim();



    }
}
