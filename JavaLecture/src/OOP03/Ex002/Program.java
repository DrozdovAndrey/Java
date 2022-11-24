package OOP03.Ex002;

import OOP03.Ex002.ExBeverage.*;


import java.util.Iterator;


public class Program {
    public static void main(String[] args) {


        //#region Worker Iterator
       
         Worker worker = new Worker(
             "Name", "FamilyName", 23, 4567);

         Iterator<String> components = worker;

         while (components.hasNext()) {
             System.out.println(worker.next());
         }
       
        //#endregion
        System.out.println("--------------------------");
        //#region Beverage Iterator

         Beverage latte = new Coffee();
         latte.addComponent(new Water("Water"));
         latte.addComponent(new Beans("Beans"));
         latte.addComponent(new Milk("Milk"));

         Iterator<Ingredient> iterator = latte;
         while (iterator.hasNext()) {
             System.out.println(iterator.next());
         }

        //#endregion
    }
}
