package ExceptionHomeWorkTwo;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
//    Реализуйте метод, который запрашивает у пользователя ввод дробного числа
//    (типа float), и возвращает введенное значение. Ввод текста вместо числа
//    не должно приводить к падению приложения, вместо этого, необходимо повторно
//    запросить у пользователя ввод данных.
    public static void main(String[] args) {
        System.out.println(getFloat());
    }
    public static float getFloat(){

        while (true) {
            try {
                System.out.println("Input float number:");
                Scanner sc = new Scanner(System.in);
                return sc.nextFloat();
            }catch (InputMismatchException e){
                System.out.println("it is not a float number, try again!");
            }
        }
    }

}
