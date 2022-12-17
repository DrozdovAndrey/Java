package ExceptionHomeworkOne;

public class Task1 {
//    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    public static void main(String[] args) {
//        arithmeticException();
//        arrayIndexOutOfBoundsException();
//        stackOverflowError();
    }
    public static int arithmeticException(){
        int a = 5, b = 0;
        return a/b;
    }

    public static void arrayIndexOutOfBoundsException(){
        int [] array = new int[5];
        for (int i = 0; i <= array.length; i++) {
            array[i] = i;
        }
    }
    public static void stackOverflowError(){
        stackOverflowError();
    }
}
