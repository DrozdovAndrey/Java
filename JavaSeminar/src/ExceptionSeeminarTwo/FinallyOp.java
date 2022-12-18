package ExceptionSeeminarTwo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyOp {
    public static void main(String[] args) {
        FileReader test = null;
        try{
            test = new FileReader("test");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception " + e.getClass().getSimpleName());;
        } finally {
            System.out.println("Finally start");
            if(test!=null){
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");;
                }
            }
            System.out.println("Finally finish");
        }
    }
}
