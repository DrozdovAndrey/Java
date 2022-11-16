package SeminarFour;

import java.util.ArrayList;
import java.util.LinkedList;

/*
1) �������� �����, �� ������� � ArrayList ��������� 10000 ���������.

2) �������� �����, �� ������� � LinkedList ��������� 10000 ���������. �������� � ����������.
System.currentTimeMillis();
 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        time(al);
        time(ll);
    }
    public static void time (ArrayList<Integer> al){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            al.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
    public static void time (LinkedList<Integer> ll){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            ll.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}