package OOP_HomeWorkOne;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Chips", 80));
        products.add(new Product("Bubble Gum", 40));
        products.add(new Product("Muffin", 50));
        products.add(new Product("Marmalade", 25));
        products.add(new Product("Cracker", 30));
        products.add(new Milk("Valio", 80, 3.2));
        products.add(new PopDrink("Coca Cola", 55, 350, "y"));
        products.add(new PopDrink("Coca Cola Diet", 55, 150, "n"));
        VendingMachine v1 = new VendingMachine(products);
        System.out.println(v1);
        System.out.println(v1.getProductBy("Chi"));
        System.out.println(v1.getProductBy(50.0));



    }
}
