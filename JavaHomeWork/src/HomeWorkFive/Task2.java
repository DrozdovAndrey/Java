package HomeWorkFive;

import java.util.*;
import java.util.stream.Stream;

/*
����� ��� ������ �����������:
���� ������
�������� �������
�������� ������
���� ������
���� �������
���� ����
���� �����
����� ������
���� ��������
����� ��������
������ ��������
����� ������
����� ������
������ ������
���� �����������
���� ��������
���� �����
���� ����

�������� ���������, ������� ������ � ������� �������������
 ����� � ����������� ����������.
 ������������� �� �������� ������������ �����
 */
public class Task2 {
    public static void main(String[] args) {
        String[] array = new String[] {
                "���� ������",
                "�������� �������",
                "�������� ������",
                "���� ������",
                "���� �������",
                "���� ����",
                "���� �����",
                "����� ������",
                "���� ��������",
                "����� ��������",
                "������ ��������",
                "����� ������",
                "����� ������",
                "������ ������",
                "���� �����������",
                "���� ��������",
                "���� �����",
                "���� ����",
        };
        sortByName(array);

    }
    public static void sortByName(String [] array){
        Map<String, Integer> countName = new HashMap<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].split(" ")[0].equals(array[j].split(" ")[0])){
                    count++;
                }
            }
            countName.put(array[i].split(" ")[0],count);
            count=0;
        }
        countName.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

    }
}
