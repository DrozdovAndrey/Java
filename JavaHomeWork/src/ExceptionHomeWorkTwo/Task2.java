package ExceptionHomeWorkTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input integer number");
            int d = sc.nextInt();
            int[] intArray = {1,2,3,4,5,6,7,8,9,10};
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }catch (InputMismatchException e){
            System.out.println("it is not a integer number");
        }

    }
}
