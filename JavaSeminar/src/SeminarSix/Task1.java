package SeminarSix;

import java.util.*;

/*
1. �������� HashSet, ��������� ��� ���������� �������: {1, 2, 3, 2, 4, 5, 6, 3}. ������������ ���������� ������� ���������.
2. �������� LinkedHashSet, ��������� ��� ���������� �������: {1, 2, 3, 2, 4, 5, 6, 3}. ������������ ���������� ������� ���������.
3. �������� TreeSet, ��������� ��� ���������� �������: {1, 2, 3, 2, 4, 5, 6, 3}. ������������ ���������� ������� ���������.
 */
public class Task1 {
    public static void main(String[] args) {
        Set <Integer> set1 = new HashSet<>(Arrays.asList(100,4,5,1,2,5,3,9));
        System.out.println(set1);
        Set <Integer> set2 = new LinkedHashSet<>(Arrays.asList(100,4,5,1,2,5,3,9));
        System.out.println(set2);
        Set <Integer> set3 = new TreeSet<>(Arrays.asList(100,4,5,1,2,5,3,9));
        System.out.println(set3);
    }

}
