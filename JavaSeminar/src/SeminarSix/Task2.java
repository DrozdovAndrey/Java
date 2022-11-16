package SeminarSix;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
1. �������� �����, ������� �������� ������ �� 1000 ��������� ���������� ������� �� 0 �� 24.
2. �������� �����, � ������� ��������� ����������� ���� ������ �
� ������� Set ��������� ������� ���������� �������� � ������ ������� � ������� ��� � ���� ����� � ��������� �������.
��� ���������� �������� ����������� �������:
������� ���������� ����� = ���������� ���������� ����� * 100 / ����� ���������� ����� � �������.
 */
public class Task2 {
    public static Integer[] fillRandom () {
        Random rnd = new Random();
        Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(0, 25);
        }
        return arr;
    }
    public static double percentUni(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        return (set.size()*100)/ arr.length;
    }
    public static void main(String[] args) {
        Integer [] arr = fillRandom();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        double count = percentUni(arr);
        System.out.println(count);

    }
}
