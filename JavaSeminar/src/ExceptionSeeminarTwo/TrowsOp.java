package ExceptionSeeminarTwo;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TrowsOp {
    public static void main(String[] args) {
        try{
            createReport();
        }catch (IIOException | FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void createReport() throws IIOException, FileNotFoundException {
        PrintWriter writer = new PrintWriter("report.txt");
        writer.close();
    }
}
