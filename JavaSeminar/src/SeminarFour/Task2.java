package SeminarFour;

import java.util.LinkedList;
import java.util.Scanner;

/*
����������� ���������� ����������, �������:

1. ��������� �� ������������ ������ ����

text~num

1. ����� ����������� ������ �� ~, ��������� text � ������� ������ �� ������� num.
2. ���� ������� print~num, ������� ������ �� ������� num � ������� ������ � ������� � �� ������.
������:
ter~1
Jiodf~2
Lsdf~3
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();
        String input = "";
        while (true){
            System.out.println("Input text:");
            input = sc.nextLine();
            if (input.equals("stop")) break;
            var element = input.split("~");
            if (element[0].equals("print")) {
                System.out.println(ll.get(Integer.parseInt(element[1])));
                ll.remove(Integer.parseInt(element[1]));
                System.out.println(ll);
            }else {
                ll.add(Integer.parseInt(element[1]), element[0]);
                System.out.println(ll);
            }
        }

    }
}
