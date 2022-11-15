package SeminarFive;

import java.util.HashMap;
import java.util.Map;

/*
������� ��������� ��� �������� ������� ��������� � ������� ����������� �����������.
123456 ������
321456 ��������
234561 �������
234432 ������
654321 �������
345678 ������
������� ������ �� ����������� � �������� ������.
 */
public class Task1 {
    public static void searchName (Map<Integer, String> map1, String name){
        for (var item:map1.entrySet()) {
            if(item.getValue().equals(name)) System.out.printf("[%d : %s]\n", item.getKey(), item.getValue());
        }
    }
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(123456, "������");
        map1.put(321456, "��������");
        map1.put(234561, "�������");
        map1.put(234432, "������");
        map1.put(654321, "�������");
        map1.put(345678, "������");
        System.out.println(map1);
        searchName(map1, "������");
    }
}
