package ExceptionHomeWorkTwo;


import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws Exception {
        int a = getInt();
        int b = getInt();
        if (b!=0){
            System.out.println(a / b);
        }
        printSum(5, 234);
        int[] abc = { 1, 2 };
        int arrIndex = getInt();
        if (arrIndex> -1 && arrIndex < abc.length){
            abc[arrIndex] = 9;
            System.out.println(Arrays.toString(abc));
        } else System.out.println("out of array length");


    }
    public static void printSum(Integer a, Integer b){
        if (a == null || b == null) System.out.println("null");
         else System.out.println(a+b);
    }
    public static int getInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer number");
        if (!sc.hasNextInt()) throw new RuntimeException("You can input only Integer number");
        return sc.nextInt();
    }

}
