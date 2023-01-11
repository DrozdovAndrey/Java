package ExceptionHomeWorkThree;


import java.util.NoSuchElementException;
import java.util.Scanner;

public class GetData {
    public static String getData(){
        System.out.println("Enter the data separated by \"space\" in the format\nLast_name First_name " +
                "Father_name Birthday(dd.mm.yyyy) Phone_number(integer numbers) Gender(f - female m - male>\")");
        String inputString = "";
        Scanner scanner = new Scanner(System.in);
        try{
             inputString = scanner.nextLine();
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        return inputString;
    }

    public static String[] parseToArray(String inputString){
        return inputString.split(" ");
    }

}
