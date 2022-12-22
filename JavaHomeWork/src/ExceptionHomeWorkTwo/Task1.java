package ExceptionHomeWorkTwo;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
//    ���������� �����, ������� ����������� � ������������ ���� �������� �����
//    (���� float), � ���������� ��������� ��������. ���� ������ ������ �����
//    �� ������ ��������� � ������� ����������, ������ �����, ���������� ��������
//    ��������� � ������������ ���� ������.
    public static void main(String[] args) {
        System.out.println(getFloat());
    }
    public static float getFloat(){

        while (true) {
            try {
                System.out.println("Input float number:");
                Scanner sc = new Scanner(System.in);
                return sc.nextFloat();
            }catch (InputMismatchException e){
                System.out.println("it is not a float number, try again!");
            }
        }
    }

}
