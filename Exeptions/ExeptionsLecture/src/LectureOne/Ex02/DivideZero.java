package LectureOne.Ex02;

public class DivideZero {
    public static void main(String[] args) {
        System.out.println(divideByZero(10,0));
    }
    public static int divideByZero(int a, int b) {
        if (b == 0){
            throw new RuntimeException("Divided by zero");
        }
        return a/b;
    }

}
