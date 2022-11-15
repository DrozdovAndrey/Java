package SeminarFive;

import java.util.HashMap;
import java.util.Map;

/*
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
 */
public class Task1 {
    public static void searchName (Map<Integer, String> map1, String name){
        for (var item:map1.entrySet()) {
            if(item.getValue().equals(name)) System.out.printf("[%d : %s]\n", item.getKey(), item.getValue());
        }
    }
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(123456, "Иванов");
        map1.put(321456, "Васильев");
        map1.put(234561, "Петрова");
        map1.put(234432, "Иванов");
        map1.put(654321, "Петрова");
        map1.put(345678, "Иванов");
        System.out.println(map1);
        searchName(map1, "Иванов");
    }
}
