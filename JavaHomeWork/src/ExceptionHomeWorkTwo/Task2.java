package ExceptionHomeWorkTwo;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int d = getInt();
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        int arrIndex = getInt();
        if (d!=0) {
            if (arrIndex> -1 && arrIndex < intArray.length) {
                double catchedRes1 = (double) intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }else System.out.println("out of array length");
        }else System.out.println("You can't divide by zero");
    }
    public static int getInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer number");
        if (!sc.hasNextInt()) throw new RuntimeException("You can input only Integer number");
        return sc.nextInt();
    }
}
