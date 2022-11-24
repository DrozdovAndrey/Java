package OOP03.Ex004;


import OOP03.Ex004.ExBeverage.Coffee;
import OOP03.Ex004.ExBeverage.Water;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("Water"));
        latte.addComponent(new Water("Water"));
        latte.addComponent(new Water("Water"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
