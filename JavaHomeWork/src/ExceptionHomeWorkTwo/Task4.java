package ExceptionHomeWorkTwo;

import java.util.Scanner;

public class Task4 {
//    ������������ ���������, ������� �������� Exception, ����� ������������
//    ������ ������ ������. ������������ ������ ���������� ���������, ���
//    ������ ������ ������� ������.
    public static void main(String[] args) {
        System.out.println(getString());
    }
    public static String getString(){
        System.out.println("Input line:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.equals("")) throw new RuntimeException("Empty line!");
        else return str;
    }
}
