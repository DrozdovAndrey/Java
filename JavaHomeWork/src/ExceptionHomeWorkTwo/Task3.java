package ExceptionHomeWorkTwo;


import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(5, 234);
            int[] abc = { 1, 2 };
            abc[1] = 9;
            System.out.println(Arrays.toString(abc));
        } catch (ArithmeticException | NullPointerException ex) {
            System.out.println("Exception: "+ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("ћассив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }

}
