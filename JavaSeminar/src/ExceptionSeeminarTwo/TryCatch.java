package ExceptionSeeminarTwo;

public class TryCatch {
    public static void main(String[] args) {
//        try{
//            int a = 0;
//            int b = 10/a;
//            System.out.println("This message will not show");
//        }catch (ArithmeticException e){
//            System.out.println("Divided by zero");
//        }
//        System.out.println("Finish work");
//        try{
//            int a = 0;
//            int b = 10/a;
//            System.out.println("This message will not show");
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }
//        System.out.println("Finish work");
        try{
            int a = 10;
            a-=10;
            int b = 10/a;
            int[] c ={1,2,3};
            c[42] = 99;
        }catch (ArithmeticException e){
            System.out.println("Divided by zero" + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException" + e);
        }
        System.out.println("after block try catch");


    }

}
