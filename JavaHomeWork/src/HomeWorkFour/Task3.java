package HomeWorkFour;
/*
� ����������� �������� ����������� �������� ��������� ��������.
������
1+2
3
+4
7
������
3
*3
9
 */
import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static int Calc(int a, int b, String sign) {
        int res = 0;
        switch (sign) {
            case ("+"):
                res = a + b;
                break;

            case ("-"):
                res = a - b;
                break;

            case ("*"):
                res = a * b;
                break;

            case ("/"):
                res = a / b;
                break;

            default:
                break;

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> lk = new LinkedList<>();
        System.out.println("����� ���������� � �����������");

        System.out.println("������� �����:");
        int a = sc.nextInt();
        lk.addFirst(a);
        System.out.println("�������� ��������: -,+,/ ��� *:");
        String sign = sc.next();
        System.out.println("������� �����: ");
        int b = sc.nextInt();
        int res = Calc(a, b, sign);
        lk.addFirst(res);
        System.out.printf("��������� = %d\n", res);

        while (true){
            System.out.println("������ ���������� - yes, ����� - no, �������� ��������� �������� - cancel");
            String choice = sc.nextLine();
            if (choice.equals("yes")) {
                a = lk.getFirst();
                System.out.println(a);
                System.out.println("�������� ��������: -,+,/ ��� *:");
                sign = sc.next();
                System.out.println("������� �����:");
                b = sc.nextInt();
                res = Calc(a, b, sign);
                lk.addFirst(res);
                System.out.printf("��������� = %d\n", res);
            }
            if (choice.equals("cancel")){
                lk.removeFirst();
                a = lk.getFirst();
                System.out.println(a);
                System.out.println("�������� ��������: -,+,/ ��� *:");
                sign = sc.next();
                System.out.println("������� �����:");
                b = sc.nextInt();
                res = Calc(a, b, sign);
                lk.addFirst(res);
                System.out.printf("��������� = %d\n", res);
            }
            if (choice.equals("no")) break;

        }


    }


}

